package com.fatsnake.spring.annotaion_07.b_di;

import com.fatsnake.spring.annotaion_07.b_di.bean.Person;
import com.fatsnake.spring.annotaion_07.b_di.config.AnnotationDIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/17 10:53
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class AnnotationDIApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationDIConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person.toString());
    }


}
