package com.fatsnake.spring.basic_di_08.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Yellow {
    
    private String name;
    
    @Value("#{new Integer[5]}")
    private Integer[] orders;
    
}
