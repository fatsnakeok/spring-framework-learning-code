package com.fatsnake.spring.annotaion_07.f_typefilter.config;

import com.fatsnake.spring.annotaion_07.f_typefilter.anno.Animal;
import com.fatsnake.spring.annotaion_07.f_typefilter.color.Color;
import com.fatsnake.spring.annotaion_07.f_typefilter.fillter.GreenTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/20 09:54
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
@ComponentScan(basePackages = "com.fatsnake.spring.annotaion_07.f_typefilter",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.fatsnake.spring.annotaion_07.f_typefilter.+Demo.+")
        },
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Color.class),
                @ComponentScan.Filter(type = FilterType.CUSTOM, value = GreenTypeFilter.class)
        })
public class TypeFilterConfiguration {
}
