package com.fatsnake.spring.bean_11.c_instantiate;

import com.fatsnake.spring.bean_11.c_instantiate.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiateXmlApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean_11/bean-instantiate.xml");
        ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + " : " + car);
        });
//        System.out.println(ctx.getBean(CarStaticFactory.class));
    }
}
