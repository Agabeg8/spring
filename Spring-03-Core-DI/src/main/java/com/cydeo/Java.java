package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class Java {
//    //Field injection
////    @Autowired
//    OfficeHours officeHours;

    //Constructor injection
    //@Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    OfficeHours officeHours;
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
