package com.fatsnake.spring.basic_di_08.a_quickstart_set;

import com.fatsnake.spring.annotaion_07.a_quickstart.bean.Person;
import com.fatsnake.spring.basic_di_08.b_constructor.bean.Cat;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: fatsnake
 * @Description": 通过set方法注入
 * @Date:2022/6/22 6:43 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class QuickstartInjectBySetXmlApplication {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
