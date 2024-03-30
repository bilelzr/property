package tn.pi.proerty.repositories;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.pi.proerty.entities.PropertyEntity;

import java.util.Optional;

public interface PropertyRepository extends JpaRepository<PropertyEntity, Long> {
}
