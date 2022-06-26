package com.fatsnake.spring.basic_di_08.i_lazyinject;

import com.fatsnake.spring.basic_di_08.i_lazyinject.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: fatsnake
 * @Description": 延迟注入，  参照f_lazylookup
 * @Date:2022/6/26 12:00 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class LazyInjectAnnoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                "com.fatsnake.spring.basic_di_08.i_lazyinject.bean");
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }
}
