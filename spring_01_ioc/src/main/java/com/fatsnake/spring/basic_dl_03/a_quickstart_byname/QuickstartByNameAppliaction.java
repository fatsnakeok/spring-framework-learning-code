package com.fatsnake.spring.basic_dl_03.a_quickstart_byname;

import com.fatsnake.spring.basic_dl_03.a_quickstart_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/16 10:40
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class QuickstartByNameAppliaction {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl_03/quickstart-byname.xml");
        Person person = (Person) factory.getBean("person");
        System.out.println(person);
    }
}
