package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext  container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        String dv = container.getBean(String.class);
        System.out.println(dv);

        Integer num = container.getBean(Integer.class);
        System.out.println(num);

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();


    }
}
