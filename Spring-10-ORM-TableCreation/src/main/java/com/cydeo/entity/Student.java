package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName; //first_name
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Transient //it does not in to the put table
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthdate;
    @Column(columnDefinition = "TIME")
    private LocalDate birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
