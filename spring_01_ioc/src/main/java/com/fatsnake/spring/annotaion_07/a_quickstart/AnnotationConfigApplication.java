package com.fatsnake.spring.annotaion_07.a_quickstart;

import com.fatsnake.spring.annotaion_07.a_quickstart.bean.Person;
import com.fatsnake.spring.annotaion_07.a_quickstart.config.QuickstartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/17 10:45
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class AnnotationConfigApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =  new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
