package com.fatsnake.architecture.d_properties.service.impl;


import com.fatsnake.architecture.d_properties.dao.DemoDao;
import com.fatsnake.architecture.d_properties.factory.BeanFactory;
import com.fatsnake.architecture.d_properties.service.DemoService;

import java.util.List;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/15 14:01
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    public DemoServiceImpl() {
        // 此处会打印多个不同bean地址，说明每次getBean都会重新创建新的对象，非常浪费资源
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }


    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
