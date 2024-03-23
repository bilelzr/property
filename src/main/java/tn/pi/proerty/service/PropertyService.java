package tn.pi.proerty.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.pi.proerty.entities.PropertyEntity;
import tn.pi.proerty.repositories.PropertyRepository;

@Service
@RequiredArgsConstructor
public class PropertyService {


    private final PropertyRepository propertyRepository;

    public PropertyEntity getPropertyByTitle(String title){
        return propertyRepository.findByTitle(title).get();
    }
    public void getProperty(){

    }
    public void addProperty(PropertyEntity employee) {
        propertyRepository.save(employee);
    }

}
