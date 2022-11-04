package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Region {

    @Id
    private Long regionId;
    private String region;
    private String country;

}
