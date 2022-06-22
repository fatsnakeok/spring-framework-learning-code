package com.fatsnake.spring.basic_di_08.b_constructor.config;

import com.fatsnake.spring.basic_di_08.b_constructor.bean.Cat;
import com.fatsnake.spring.basic_di_08.b_constructor.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/22 6:46 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
public class InjectByConstructorConfiguration {

    @Bean
    public Person person() {
        return new Person("test-person-anno-byconstructor", 18);
    }

    @Bean
    public Cat cat() {
        return new Cat("test-son-anno", person());
    }

}
