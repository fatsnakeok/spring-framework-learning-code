package com.fatsnake.spring.basic_di_08.a_quickstart_set.config;

import com.fatsnake.spring.basic_di_08.a_quickstart_set.bean.Cat;
import com.fatsnake.spring.basic_di_08.a_quickstart_set.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/22 6:37 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
public class QuickstartInjectBySetConfiguration {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("test-person-anno-byset");
        person.setAge(18);
        return person;
    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("test-cat-anno");
        cat.setMaster(person());
        return cat;
    }
}
