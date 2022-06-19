package com.fatsnake.spring.e_basePackageClasses.config;

import com.fatsnake.spring.e_basePackageClasses.bean.DemoDao;
import com.fatsnake.spring.e_basePackageClasses.component.DemoComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: fatsnake
 * @Description": basePackageClasses属性会去扫描类所在包下的所有组件，而不是指定某个组件！
 * @Date:2022/6/19 10:20 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Configuration
@ComponentScan(basePackageClasses = {DemoDao.class, DemoComponent.class})
public class BasePackageClassConfiguration {
}
