package com.case2.addressRegistration.dao;

import com.case2.addressRegistration.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDao extends JpaRepository<Country, Long> {

    Country findByCountryCode(String countryCode);

}
