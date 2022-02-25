package com.case2.addressRegistration.service;


import com.case2.addressRegistration.converter.AddressMapper;
import com.case2.addressRegistration.dao.AddressDao;
import com.case2.addressRegistration.dto.AddressDto;
import com.case2.addressRegistration.dto.AddressSaveRequestDto;
import com.case2.addressRegistration.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressDao addressDao;

    public AddressDto saveAddress(AddressSaveRequestDto addressSaveRequestDto){

        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveRequestDto);

        address = addressDao.save(address);

        return AddressMapper.INSTANCE.convertToAddressDto(address);
    }

    public void deleteAddress(Long id){

        addressDao.deleteById(id);
    }

    public AddressDto findAddressById(Long id){

        Address address;

        if(addressDao.findById(id).isPresent()){
            address = addressDao.findById(id).get();
        }else{
            throw new RuntimeException("Item not found");
        }

        return AddressMapper.INSTANCE.convertToAddressDto(address);
    }
}
