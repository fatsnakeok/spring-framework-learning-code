package com.fatsnake.spring.basic_dl_03.c_oftype;

import com.fatsnake.spring.basic_dl_03.c_oftype.dao.DemoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;
import java.util.Map;

/**
 * BeanFactory 接口提供了一个抽象的配置和对象的管理机制，ApplicationContext 是 BeanFactory 的子接口，它简化了与 AOP 的整合、消息机制、事件机制，以及对 Web 环境的扩展（ WebApplicationContext 等），BeanFactory 是没有这些扩展的。
 *
 * ApplicationContext 主要扩展了以下功能：
 *
 * AOP 的支持（ AnnotationAwareAspectJAutoProxyCreator 作用于 Bean 的初始化之后 ）
 * 配置元信息（ BeanDefinition 、Environment 、注解等 ）
 * 资源管理（ Resource 抽象 ）
 * 事件驱动机制（ ApplicationEvent 、ApplicationListener ）
 * 消息与国际化（ LocaleResolver ）
 * Environment 抽象（ SpringFramework 3.1 以后）
 * @Auther: fatsnake
 * @Description": 父类 / 接口来找实现类
 * 如果一个接口有多个实现，而咱又想一次性把这些都拿出来，那 getBean 方法显然就不够用了，需要使用额外的方式。
 * @Date:2022/6/16 11:12
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class OfTypeApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl_03/quickstart-oftype.xml");
        Map<String, DemoDao> beanMap =  ctx.getBeansOfType(DemoDao.class);

        beanMap.forEach((beanName, bean) -> {
            System.out.println(beanName + ":" + bean.toString());
        });
    }
}
