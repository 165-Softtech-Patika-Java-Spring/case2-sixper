package com.case2.addressRegistration.service;

import com.case2.addressRegistration.dao.CityDao;
import com.case2.addressRegistration.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityDao cityDao;

    public City saveCity(City city){

        city = cityDao.save(city);

        return city;
    }

    public City getCityByPlateCode(String plateCode){

        return cityDao.getCityByPlateCode(plateCode);
    }
}
