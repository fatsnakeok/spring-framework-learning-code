package com.fatsnake.spring.bean_11.b_scope;

import com.fatsnake.spring.bean_11.a_type.bean.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeXmlApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean_11/bean-scope.xml");
        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println(name + " : " + child);
        });
    }
}
