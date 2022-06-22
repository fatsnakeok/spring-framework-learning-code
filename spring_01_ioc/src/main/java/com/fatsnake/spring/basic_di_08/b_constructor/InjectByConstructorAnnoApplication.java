package com.fatsnake.spring.basic_di_08.b_constructor;

import com.fatsnake.spring.basic_di_08.b_constructor.bean.Cat;
import com.fatsnake.spring.basic_di_08.b_constructor.bean.Person;
import com.fatsnake.spring.basic_di_08.b_constructor.config.InjectByConstructorConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: fatsnake
 * @Description": 通过构造方法注入
 * @Date:2022/6/22 6:48 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class InjectByConstructorAnnoApplication {

    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(InjectByConstructorConfiguration.class);
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
