package com.case2.addressRegistration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "NEIGHBORHOOD")
@Getter
@Setter
public class Neighborhood {

    @Id
    @GeneratedValue(generator = "Neighborhood")
    @SequenceGenerator(name = "Neighborhood", sequenceName = "NEIGHBORHOOD_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "ID_DISTRICT")
    private Long districtId;
}
