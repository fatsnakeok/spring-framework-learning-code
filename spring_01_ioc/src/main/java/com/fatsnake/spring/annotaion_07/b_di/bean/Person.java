package com.fatsnake.spring.annotaion_07.b_di.bean;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/17 10:49
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class Person {
    public String name;

    public Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
