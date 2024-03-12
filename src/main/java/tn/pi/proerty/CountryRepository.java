package tn.pi.proerty;

import com.baeldung.springsoap.gen.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {


    Optional<CountryEntity> findByName(String name);
}

