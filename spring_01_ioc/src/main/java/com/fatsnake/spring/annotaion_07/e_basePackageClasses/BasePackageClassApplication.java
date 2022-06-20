package com.fatsnake.spring.annotaion_07.e_basePackageClasses;

import com.fatsnake.spring.annotaion_07.e_basePackageClasses.config.BasePackageClassConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/19 10:21 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class BasePackageClassApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BasePackageClassConfiguration.class);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
    }
}
