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

    public DemoServiceImpl () {
        
    }


    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
