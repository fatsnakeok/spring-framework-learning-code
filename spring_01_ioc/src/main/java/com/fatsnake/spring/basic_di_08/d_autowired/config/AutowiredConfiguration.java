package com.fatsnake.spring.basic_di_08.d_autowired.config;

import com.fatsnake.spring.basic_di_08.d_autowired.bean.Cat;
import com.fatsnake.spring.basic_di_08.d_autowired.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/22 7:57 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
@ComponentScan("com.fatsnake.spring.basic_di_08.d_autowired.bean")
public class AutowiredConfiguration {

    @Bean
    @Autowired // 自动注入 person
    public Cat cat(Person person) {
        Cat cat = new Cat();
        cat.setName("mini");
        cat.setPerson(person);
        return cat;
    }

    @Bean
    @Primary // 同类型，多个bean时，此bean为默认注入对象
    public Person master() {
        Person master = new Person();
        master.setName("master");
        return master;
    }


}
