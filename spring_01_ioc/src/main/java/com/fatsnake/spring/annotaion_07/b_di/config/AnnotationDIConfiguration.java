package com.fatsnake.spring.annotaion_07.b_di.config;

import com.fatsnake.spring.annotaion_07.b_di.bean.Person;
import org.springframework.context.annotation.Bean;

import java.security.PublicKey;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/17 10:50
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class AnnotationDIConfiguration {


    /**
     * 通过注解注册bean，并且指定属性值
     *
     * @return
     */
    @Bean
    public Person person() {
        Person person = new Person();
        person.setAge(123);
        person.setName("personName");
        return person;
    }

}
