package com.fatsnake.spring.d_importxml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther: fatsnake
 * @Description":  通过包含bean的xml注册到IOC
 * @Date:2022/6/19 10:02 上午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
@ImportResource("classpath:annotation/xml-config.xml")
public class ImportXmlAnnotationConfiguration {
}
