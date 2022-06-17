package com.fatsnake.spring.basic_dl_03.f_lazylookup;

import com.fatsnake.spring.basic_dl_03.f_lazylookup.bean.Cat;
import com.fatsnake.spring.basic_dl_03.f_lazylookup.bean.Dog;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/17 09:33
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class ImmediatlyLookupApplication {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl_03/quickstart-lazylookup.xml");

        Cat cat = ctx.getBean(Cat.class);

        System.out.println(cat);

        // 没有注册Dog这个bean,不优雅的处理
        Dog dog;
//        try {
//            dog = ctx.getBean(Dog.class);
//        } catch (NoSuchBeanDefinitionException e) {
//        	dog = new Dog();
//        }

        // 判断ioc中是否存在此bean， 没有就new
        dog = ctx.containsBean("dog") ? (Dog)ctx.getBean("dog") : new Dog();
        System.out.println(dog);


    }





}
