package com.fatsnake.spring.annotaion_07.h_propertyxml;

import com.fatsnake.spring.annotaion_07.h_propertyxml.bean.JdbcXmlProperty;
import com.fatsnake.spring.annotaion_07.h_propertyxml.config.JdbcXmlConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/20 16:25
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class PropertySourceXmlApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcXmlConfiguration.class);
        System.out.println(ctx.getBean(JdbcXmlProperty.class).toString());
    }


}
