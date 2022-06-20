package com.fatsnake.spring.annotaion_07.d_importxml.config;

import com.fatsnake.spring.annotaion_07.c_scan.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: fatsnake
 * @Description": 通过配置类进行配置
 * @Date:2022/6/19 10:00 上午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
public class AnnotationConfigConfiguration {

    @Bean
    public Person person() {
        return new Person();
    }


}
