package com.fatsnake.architecture.c_reflect.e_cachefactory.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Auther: fatsnake
 * @Description": 缓存已创建对象，避免每次getBean创建新的对象
 * @Date:2022/6/15 13:56
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class BeanFactory {


    private static Properties properties;

    private static volatile Map<String, Object> beanMap = new HashMap<>();

    // 使用静态代码块初始化properties，加载factory_e.properties文件
    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory_e.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    public static Object getBean(String beanName) {
        // https://www.jb51.net/article/222908.htm 使用双检锁
        // 双检锁保证beanMap中确实没有beanName对应的对象
        if (!beanMap.containsKey(beanName)) {
            // class对象锁 ：https://zhuanlan.zhihu.com/p/379547006
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    // 过了双检锁，证明确实没有，可以执行反射创建
                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object object = beanClazz.newInstance();
                        // 反射创建后放入缓存返回
                        beanMap.put(beanName, object);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }

}
