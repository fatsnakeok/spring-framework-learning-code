package com.fatsnake.spring.annotaion_07.c_scan;

import com.fatsnake.spring.annotaion_07.c_scan.bean.Person;
import com.fatsnake.spring.annotaion_07.c_scan.config.ComponentScanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/19 9:44 上午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */

public class ComponentScanApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        // ApplicationContext ctx = new AnnotationConfigApplicationContext("com.fatsnake.spring.c_scan.bean");
        Person person = ctx.getBean(Person.class);
        System.out.println(person);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.asList(beanNames).forEach(System.out::println);



    }
}
