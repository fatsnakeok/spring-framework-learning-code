package com.fatsnake.spring.basic_di_08.f_jsr330.bean;

public class Person {
    
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}
