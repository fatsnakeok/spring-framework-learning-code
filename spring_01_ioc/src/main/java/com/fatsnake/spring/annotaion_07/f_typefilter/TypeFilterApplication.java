package com.fatsnake.spring.annotaion_07.f_typefilter;

import com.fatsnake.spring.annotaion_07.f_typefilter.config.TypeFilterConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TypeFilterApplication {
    
    public static void main(String[] args) throws Exception {
        // 按照类型进行过滤注入
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TypeFilterConfiguration.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
