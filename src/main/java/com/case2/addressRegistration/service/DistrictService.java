package com.case2.addressRegistration.service;

import com.case2.addressRegistration.dao.DistrictDao;
import com.case2.addressRegistration.entity.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictService {

    private final DistrictDao districtDao;

    public District saveDistrict(District district){

        return districtDao.save(district);
    }

    public List<District> findAllDistrictByCityId(Long cityId){

        return districtDao.findAllByCityId(cityId);
    }

}
