package com.case2.addressRegistration.converter;


import com.case2.addressRegistration.dto.AddressDto;
import com.case2.addressRegistration.dto.AddressSaveRequestDto;
import com.case2.addressRegistration.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressSaveRequestDto addressSaveRequestDto);

    AddressDto convertToAddressDto(Address address);
}
