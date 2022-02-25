package com.case2.addressRegistration.service;

import com.case2.addressRegistration.dao.CountryDao;
import com.case2.addressRegistration.entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryDao countryDao;

    public Country saveCountry(Country country){

        return countryDao.save(country);

    }

    public Country findByCountryCode(String countryCode){

        return countryDao.findByCountryCode(countryCode);

    }


}
