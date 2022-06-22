package com.fatsnake.spring.basic_di_08.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Black {
    
    @Value("black-value-anno")
    private String name;
    
    @Value("0")
    private Integer order;
    
    @Override
    public String toString() {
        return "Black{" + "name='" + name + '\'' + ", order=" + order + '}';
    }
}
