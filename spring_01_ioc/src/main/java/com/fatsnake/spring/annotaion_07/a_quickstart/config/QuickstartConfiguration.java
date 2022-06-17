package com.fatsnake.spring.annotaion_07.a_quickstart.config;

import com.fatsnake.spring.annotaion_07.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/17 10:42
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
public class QuickstartConfiguration {

    /**
     * 通过注解，注册bean
     * @return
     */
    @Bean
        public Person person() {
            return new Person();
        }
}
