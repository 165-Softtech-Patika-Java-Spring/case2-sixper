package com.case2.addressRegistration.service;

import com.case2.addressRegistration.dao.StreetDao;
import com.case2.addressRegistration.entity.Street;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StreetService {

    private final StreetDao streetDao;

    public Street saveStreet(Street street){

        return streetDao.save(street);
    }

    public Street updateStreetName(Long id, String name){

        Street street;

        if(streetDao.findById(id).isPresent()){
            street = streetDao.findById(id).get();
        }else{
            throw new RuntimeException("Item not found");
        }

        street.setName(name);

        return streetDao.save(street);
    }

    public List<Street> findAllStreetByNeighborhoodId(Long neighborhoodId){

        return streetDao.findAllByNeighborhoodId(neighborhoodId);
    }
}
