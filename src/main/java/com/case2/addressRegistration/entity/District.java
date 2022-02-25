package com.case2.addressRegistration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DISTRICT")
@Getter
@Setter
public class District {


    @Id
    @GeneratedValue(generator = "District")
    @SequenceGenerator(name = "District", sequenceName = "DISTRICT_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "ID_CITY")
    private Long cityId;
}
