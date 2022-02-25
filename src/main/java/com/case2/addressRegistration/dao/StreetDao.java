package com.case2.addressRegistration.dao;

import com.case2.addressRegistration.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetDao extends JpaRepository<Street, Long> {

    List<Street> findAllByNeighborhoodId(Long neighborhoodId);
}
