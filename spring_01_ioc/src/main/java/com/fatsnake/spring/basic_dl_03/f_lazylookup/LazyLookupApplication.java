package com.fatsnake.spring.basic_dl_03.f_lazylookup;

import com.fatsnake.spring.basic_dl_03.f_lazylookup.bean.Cat;
import com.fatsnake.spring.basic_dl_03.f_lazylookup.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/17 09:52
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class LazyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl_03/quickstart-lazylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        // 下面的代码会报Bean没有定义 NoSuchBeanDefinitionException
        // Dog dog = ctx.getBean(Dog.class);
        // System.out.println(dog);


        // 此行代码不会报错
        ObjectProvider<Dog> dogObjectProvider = ctx.getBeanProvider(Dog.class);
        // 只有当执行getObject方法时才会检查是否存在，实现延迟查找
//        System.out.println(dogObjectProvider.getObject());

        // jdk8之后ObjectProvider接口有新的扩展，借助Supplier接口返回缺省创建
        Dog defaultDog = dogObjectProvider.getIfAvailable(Dog::new);
        System.out.println(defaultDog);
        // 只有存在Bean时才会执行Consumer接口的方法
        dogObjectProvider.ifAvailable(System.out::println);

    }

}
