package com.fatsnake.spring.basic_di_08.a_quickstart_set;

import com.fatsnake.spring.basic_di_08.a_quickstart_set.bean.Cat;
import com.fatsnake.spring.basic_di_08.a_quickstart_set.bean.Person;
import com.fatsnake.spring.basic_di_08.a_quickstart_set.config.QuickstartInjectBySetConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: fatsnake
 * @Description": 通过set方法注入
 * @Date:2022/6/22 6:40 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class QuickstartInjectBySetAnnoApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(QuickstartInjectBySetConfiguration.class);
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
