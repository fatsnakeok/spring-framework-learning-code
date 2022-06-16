package com.fatsnake.spring.basic_dl_03.d_withanno;

import com.fatsnake.spring.basic_dl_03.d_withanno.anno.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/16 11:27
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class WithAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl_03/quickstart-withanno.xml");
        Map<String, Object> beanMap = ctx.getBeansWithAnnotation(Color.class);
        beanMap.forEach((beanName, bean) -> {
            System.out.println(beanName + ":" + bean);
        });
    }
}
