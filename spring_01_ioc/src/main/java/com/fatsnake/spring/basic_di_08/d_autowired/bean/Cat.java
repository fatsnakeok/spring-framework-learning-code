package com.fatsnake.spring.basic_di_08.d_autowired.bean;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/22 7:51 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class Cat {

    private String name;

    private  Person person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
