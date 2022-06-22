package com.fatsnake.spring.basic_di_08.d_autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/22 7:55 下午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Component
public class Dog {

    @Value("dogdog")
    private String name;

    /***
     * 按照name进行注入
     * 指定注入Bean的名称
     */
    @Autowired
    @Qualifier("administrator")
    private Person person;

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

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    private List<Person> personList;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", person=" + person +
                ", personList=" + personList +
                '}';
    }
}
