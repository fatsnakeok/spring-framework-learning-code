package com.fatsnake.spring.basic_di_08.i_lazyinject.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/26 11:58 上午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Component
public class Dog {

    @Autowired
    private ObjectProvider<Person> person;

    @Override
    public String toString() {
        return "Dog{" +
                "person=" + person.getIfAvailable(Person::new) +
                '}';
    }
}
