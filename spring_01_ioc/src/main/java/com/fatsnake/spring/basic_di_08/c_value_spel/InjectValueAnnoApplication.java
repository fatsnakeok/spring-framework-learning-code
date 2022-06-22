package com.fatsnake.spring.basic_di_08.c_value_spel;

import com.fatsnake.spring.basic_di_08.c_value_spel.bean.Black;
import com.fatsnake.spring.basic_di_08.c_value_spel.bean.Blue;
import com.fatsnake.spring.basic_di_08.c_value_spel.bean.Red;
import com.fatsnake.spring.basic_di_08.c_value_spel.config.InjectValueConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spel 表达式
 */
public class InjectValueAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Black black = ctx.getBean(Black.class);
        System.out.println("simple value : " + black);
    
        Red red = ctx.getBean(Red.class);
        System.out.println("properties value : " + red);
    
        Blue blue = ctx.getBean(Blue.class);
        System.out.println("use spel : " + blue);
    }
}
