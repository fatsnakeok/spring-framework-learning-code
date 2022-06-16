package com.fatsnake.architecture.d_properties.factory;

import com.fatsnake.architecture.d_properties.dao.DemoDao;
import com.fatsnake.architecture.d_properties.service.DemoService;

import java.io.IOException;
import java.util.Properties;

/**
 * @Auther: fatsnake
 * @Description": 配置外部化
 * @Date:2022/6/15 13:56
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class BeanFactory {

    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory_d.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    public static Object getBean(String beanName) {
        try {
            Class<?>  beanClazz = Class.forName(properties.getProperty(beanName));
            return beanClazz.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("[" + beanName + "] instantiation error!", e);
        }
    }

}
