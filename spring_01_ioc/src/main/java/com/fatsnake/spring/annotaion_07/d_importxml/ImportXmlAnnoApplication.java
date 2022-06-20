package com.fatsnake.spring.annotaion_07.d_importxml;

import com.fatsnake.spring.annotaion_07.d_importxml.config.ImportXmlAnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

/**
 * @Auther: fatsnake
 * @Description": xml和注解混合使用
 * @Date:2022/6/19 10:04 上午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class ImportXmlAnnoApplication {

    public static void main(String[] args) {


        // xml引入配置类，在配置类中通过注解注册bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation/import-anno.xml");
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("----------------------");

        // 注册类引入xml，在xml中注册bean
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(ImportXmlAnnotationConfiguration.class);
        Stream.of(ctx2.getBeanDefinitionNames()).forEach(System.out::println);
    }


}
