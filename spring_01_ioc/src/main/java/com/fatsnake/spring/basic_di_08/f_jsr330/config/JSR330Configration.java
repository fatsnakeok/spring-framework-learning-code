package com.fatsnake.spring.basic_di_08.f_jsr330.config;

import com.fatsnake.spring.basic_di_08.f_jsr330.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fatsnake.spring.basic_di_08.f_jsr330.bean")
public class JSR330Configration {
    
    @Bean
    public Person person() {
        return new Person("person");
    }
    
    @Bean
    public Person admin() {
        return new Person("admin");
    }
    
}
