package tn.pi.proerty.dto;

import com.baeldung.springsoap.gen.Property;
import tn.pi.proerty.entities.PropertyEntity;

import java.util.ArrayList;
import java.util.List;

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
        soap.setStatus(entity.getStatus());
        return soap;
    }

    public static List<Property> mapMultipleEntityToSoap(List<PropertyEntity> entityList) {
        List<Property> propertyList = new ArrayList<>();
        entityList.forEach(propertyEntity -> {
            Property soap = new Property();
            soap.setDescription(propertyEntity.getDescription());
            soap.setId(propertyEntity.getId());
            soap.setLocation(propertyEntity.getLocation());
            soap.setPrice(propertyEntity.getPrice());
            soap.setTitle(propertyEntity.getTitle());
            soap.setUserFk(propertyEntity.getUser());
            soap.setStatus(propertyEntity.getStatus());
            propertyList.add(soap);
        });

        return propertyList;
    }

    public static PropertyEntity mapSoapToEntity(Property soap) {
        PropertyEntity entity = new PropertyEntity();
        entity.setDescription(soap.getDescription());
        entity.setUser(soap.getUserFk());
        entity.setTitle(soap.getTitle());
        entity.setLocation(soap.getLocation());
        entity.setPrice(soap.getPrice());
        entity.setId(soap.getId());
        entity.setStatus(soap.getStatus());
        // Map other properties as needed
        return entity;
    }
}
