package com.fatsnake.spring.basic_dl_03.e_beannames;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.stream.Stream;

/**
 * @Auther: fatsnake
 * @Description":获取IOC容器中的所有Bean
 * @Date:2022/6/16 11:52
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class BeannamesApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl_03/quickstart-withanno.xml");
        String[] beanNames = context.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(beanName -> System.out.println(beanName));
    }
}
