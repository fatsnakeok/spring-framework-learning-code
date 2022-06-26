package com.fatsnake.spring.basic_di_08.h_aware.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @Auther: fatsnake
 * @Description":
 * BeanNameAware : 回调注入 BeanFactory
 * ApplicationContextAware: 回调注入 ApplicationContext（与上面不同，后续 IOC 高级讲解）
 * @Date:2022/6/26 11:39 上午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Component
public class AwaredTestBean implements ApplicationContextAware, BeanNameAware {

    private String beanName;
    private ApplicationContext ctx;

    public String getName() {
        return beanName;
    }

    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
