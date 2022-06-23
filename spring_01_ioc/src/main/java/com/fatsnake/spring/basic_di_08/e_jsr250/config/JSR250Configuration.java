package com.fatsnake.spring.basic_di_08.e_jsr250.config;

import com.fatsnake.spring.basic_di_08.e_jsr250.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fatsnake.spring.basic_di_08.e_jsr250.bean")
public class JSR250Configuration {
    
    @Bean
    public Person master() {
        return new Person("master");
    }
    
    @Bean
    public Person admin() {
        return new Person("admin");
    }
    
}
