package com.case2.addressRegistration.dao;

import com.case2.addressRegistration.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends JpaRepository<Address, Long> {
}
