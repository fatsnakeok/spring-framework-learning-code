package com.fatsnake.spring.basic_di_08.g_complexfield.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("miaomiao")
public class Cat {
    
    @Value("miaomiao")
    private String name = "cat";
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }
}
