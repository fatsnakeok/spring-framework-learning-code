package com.fatsnake.spring.annotaion_07.h_propertyxml.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/20 16:22
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
@ComponentScan("com.fatsnake.spring.annotaion_07.h_propertyxml.bean")
@PropertySource("classpath:propertysource/jdbc.xml")
public class JdbcXmlConfiguration {
}
