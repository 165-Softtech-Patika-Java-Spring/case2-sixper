package com.case2.addressRegistration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CITY")
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(generator = "City")
    @SequenceGenerator(name = "City", sequenceName = "CITY_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "PLATE_CODE", length = 10, nullable = false)
    private String plateCode;

    @Column(name = "ID_COUNTRY")
    private Long countryId;
}
