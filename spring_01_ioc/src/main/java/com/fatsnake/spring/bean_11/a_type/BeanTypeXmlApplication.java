package com.fatsnake.spring.bean_11.a_type;

import com.fatsnake.spring.bean_11.a_type.bean.Toy;
import com.fatsnake.spring.bean_11.a_type.bean.ToyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class BeanTypeXmlApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean_11/bean-type.xml");
    
        Map<String, Toy> toys = ctx.getBeansOfType(Toy.class);
        toys.forEach((name, toy) -> {
            System.out.println("toy name : " + name + ", " + toy.toString());
        });
    
        Toy toy1 = ctx.getBean(Toy.class);
        Toy toy2 = ctx.getBean(Toy.class);
        System.out.println(toy1 == toy2);
    
        ToyFactoryBean factoryBean = ctx.getBean(ToyFactoryBean.class);
        System.out.println(factoryBean);
        System.out.println(ctx.getBean("toyFactory"));
        System.out.println(ctx.getBean("&toyFactory"));
    }
}
