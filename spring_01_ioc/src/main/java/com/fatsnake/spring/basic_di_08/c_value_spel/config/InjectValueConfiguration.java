package com.fatsnake.spring.basic_di_08.c_value_spel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/22 7:41 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
@ComponentScan("com.fatsnake.spring.basic_di_08.c_value_spel.bean")
@PropertySource("classpath:basic_di/value/red.properties")
public class InjectValueConfiguration {
}
