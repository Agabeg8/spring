package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    //Direct Wiring
//    @Bean
//    Person person(){
//
//        Person p = new Person();
//        p.setCar(car());
//        p.setName("Mike");
//        return p;
//    }
    //Auto wiring
    @Bean
    Person person(Car car){

        Person p = new Person();
        p.setCar(car);
        p.setName("Mike");
        return p;
    }
}
