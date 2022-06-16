package com.fatsnake.spring.basic_dl_03.b_bytype;

import com.fatsnake.spring.basic_dl_03.b_bytype.bean.Person;
import com.fatsnake.spring.basic_dl_03.b_bytype.dao.DemoDao;
import com.fatsnake.spring.basic_dl_03.b_bytype.dao.impl.DemoDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/16 10:58
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class QuickstartByTypeApplication {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl_03/quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = (DemoDao) factory.getBean(DemoDaoImpl.class);
        System.out.println(demoDao);
    }
}
