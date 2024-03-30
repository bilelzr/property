package tn.pi.proerty.web;

import com.baeldung.springsoap.gen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import tn.pi.proerty.dto.PropertyMapper;
import tn.pi.proerty.entities.PropertyEntity;
import tn.pi.proerty.service.PropertyService;

import java.util.List;


@Endpoint
@CrossOrigin
public class PropertyEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    private final PropertyService propertyService;

    @Autowired
    public PropertyEndpoint(PropertyService propertyService) {
        this.propertyService = propertyService;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllPropertiesRequest")
    @ResponsePayload
    public GetAllPropertiesResponse getAllProperty(@RequestPayload GetAllPropertiesRequest request) {
        GetAllPropertiesResponse response = new GetAllPropertiesResponse();
        List<PropertyEntity> property = propertyService.getAllProperties();
        response.getProperty().addAll(PropertyMapper.mapMultipleEntityToSoap(property));
        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPropertyRequest")
    @ResponsePayload
    public GetPropertyResponse getPropertyByTitle(@RequestPayload GetPropertyRequest request) {
        PropertyEntity property = propertyService.getPropertyById(request.getId());
        GetPropertyResponse response = new GetPropertyResponse();
        response.setProperty(PropertyMapper.mapEntityToSoap(property));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addPropertyRequest")
    @ResponsePayload
    public AddPropertyResponse addEmployee(@RequestPayload AddPropertyRequest request) {
        AddPropertyResponse response = new AddPropertyResponse();
        PropertyEntity property = propertyService.addProperty(PropertyMapper.mapSoapToEntity(request.getProperty()));
        response.setProperty(PropertyMapper.mapEntityToSoap(property));
        return response;
    }

}
