package tn.pi.proerty.dto;

import com.baeldung.springsoap.gen.Property;
import tn.pi.proerty.entities.PropertyEntity;

public class PropertyMapper {


    private PropertyMapper() {

    }


    public static Property mapEntityToSoap(PropertyEntity entity) {
        Property soap = new Property();
        soap.setDescription(entity.getDescription());
        soap.setId(entity.getId());
        soap.setLocation(entity.getLocation());
        soap.setPrice(entity.getPrice());
        soap.setTitle(entity.getTitle());
        soap.setUserFk(entity.getUser());
        return soap;
    }

    public static PropertyEntity mapSoapToEntity(Property soap) {
        PropertyEntity entity = new PropertyEntity();
        entity.setDescription(soap.getDescription());
        entity.setUser(soap.getUserFk());
        entity.setTitle(soap.getTitle());
        entity.setLocation(soap.getLocation());
        entity.setPrice(soap.getPrice());
        entity.setId(soap.getId());
        // Map other properties as needed
        return entity;
    }
}
