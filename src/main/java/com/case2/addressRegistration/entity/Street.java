package com.case2.addressRegistration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "STREET")
@Getter
@Setter
public class Street {

    @Id
    @GeneratedValue(generator = "Street")
    @SequenceGenerator(name = "Street", sequenceName = "STREET_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "ID_NEIGHBORHOOD")
    private Long neighborhoodId;
}
