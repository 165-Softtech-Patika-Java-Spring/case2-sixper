package com.case2.addressRegistration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
public class Address {


    @Id
    @GeneratedValue(generator = "Address")
    @SequenceGenerator(name = "Address", sequenceName = "ADDRESS_ID_SEQ")
    private Long id;


    @Column(name = "ID_COUNTRY")
    private Long countryId;

    @Column(name = "ID_CITY")
    private Long cityId;

    @Column(name = "ID_DISTRICT")
    private Long districtId;

    @Column(name = "ID_NEIGHBORHOOD")
    private Long neighborhoodId;

    @Column(name = "ID_STREET")
    private Long streetId;

    @Column(name = "APARTMENT_NUMBER")
    private Long apartmentNumber;

    @Column(name = "DOOR_NUMBER")
    private Long doorNumber;

}
