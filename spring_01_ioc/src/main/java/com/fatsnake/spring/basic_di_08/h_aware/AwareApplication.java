package com.fatsnake.spring.basic_di_08.h_aware;

import com.fatsnake.spring.basic_di_08.h_aware.bean.AwaredTestBean;
import com.fatsnake.spring.basic_di_08.h_aware.config.AwareConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: fatsnake
 * @Description": 回调注入
 * @Date:2022/6/26 11:51 上午
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class AwareApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwaredTestBean bb = ctx.getBean(AwaredTestBean.class);
        bb.printBeanNames();
        System.out.println("---");
        System.out.println(bb.getName());
    }

}
