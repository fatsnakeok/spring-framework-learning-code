package com.fatsnake.spring.bean_11.b_scope;

import com.fatsnake.spring.bean_11.a_type.bean.Child;
import com.fatsnake.spring.bean_11.b_scope.config.BeanScopeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println(name + " : " + child);
        });
    }
}
