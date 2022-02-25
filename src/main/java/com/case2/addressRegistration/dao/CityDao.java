package com.case2.addressRegistration.dao;

import com.case2.addressRegistration.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends JpaRepository<City, Long> {

    City getCityByPlateCode(String plateCode);
}
