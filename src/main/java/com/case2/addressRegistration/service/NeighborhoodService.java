package com.case2.addressRegistration.service;

import com.case2.addressRegistration.dao.NeighborhoodDao;
import com.case2.addressRegistration.entity.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NeighborhoodService {

    private final NeighborhoodDao neighborhoodDao;

    public Neighborhood saveNeighborhood(Neighborhood neighborhood){

        return neighborhoodDao.save(neighborhood);
    }

    public Neighborhood updateNeighborhoodName(Long id, String name){

        Neighborhood neighborhood;

        if(neighborhoodDao.findById(id).isPresent()){
            neighborhood = neighborhoodDao.findById(id).get();
        }else{
            throw new RuntimeException("Item not found");
        }

        neighborhood.setName(name);

        return neighborhoodDao.save(neighborhood);
    }

    public List<Neighborhood> findAllNeighborhoodByDistrictId(Long districtId){

        return neighborhoodDao.findAllByDistrictId(districtId);
    }
}
