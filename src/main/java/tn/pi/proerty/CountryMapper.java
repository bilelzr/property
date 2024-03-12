package tn.pi.proerty;

import com.baeldung.springsoap.gen.Country;

public class CountryMapper {

    public static Country mapEntityToSoap(CountryEntity entity) {
        Country soap = new Country();
        soap.setName(entity.getName());
        soap.setPopulation(entity.getPopulation());
        soap.setCapital(entity.getCapital());
        // Map other properties as needed
        return soap;
    }

    public static CountryEntity mapSoapToEntity(Country soap) {
        CountryEntity entity = new CountryEntity();
        entity.setName(soap.getName());
        entity.setPopulation(soap.getPopulation());
        entity.setCapital(soap.getCapital());
        // Map other properties as needed
        return entity;
    }
}
