package com.case2.addressRegistration.dto;


import lombok.Data;

@Data
public class AddressSaveRequestDto {

    private Long countryId;
    private Long cityId;
    private Long districtId;
    private Long neighborhoodId;
    private Long streetId;
    private String apartmentNumber;
    private String doorNumber;
}
