package com.fatsnake.spring.basic_di_08.d_autowired.bean;

import org.springframework.stereotype.Component;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/22 7:53 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Component("administrator")
public class Person {

    private String name = "administrator";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
