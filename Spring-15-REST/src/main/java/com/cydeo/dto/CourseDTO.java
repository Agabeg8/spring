package com.cydeo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
public class CourseDTO {


    private Long id;


    private String name;


    private String category;


    private int rating;


    private String description;

}
