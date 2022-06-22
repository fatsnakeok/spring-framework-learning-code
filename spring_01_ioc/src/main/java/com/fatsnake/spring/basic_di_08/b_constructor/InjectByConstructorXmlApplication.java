package com.fatsnake.spring.basic_di_08.b_constructor;

import com.fatsnake.spring.basic_di_08.b_constructor.bean.Cat;
import com.fatsnake.spring.basic_di_08.b_constructor.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/22 6:49 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class InjectByConstructorXmlApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-constructor.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
