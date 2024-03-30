package tn.pi.proerty.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.pi.proerty.entities.PropertyEntity;
import tn.pi.proerty.repositories.PropertyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyService {


    private final PropertyRepository propertyRepository;

    public PropertyEntity getPropertyById(Long  title) {
        return propertyRepository.findById(title).get();
    }

    public List<PropertyEntity> getAllProperties() {
        return propertyRepository.findAll();
    }

    public PropertyEntity addProperty(PropertyEntity employee) {
        return propertyRepository.save(employee);
    }

}
