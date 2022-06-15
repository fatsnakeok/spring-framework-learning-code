package com.fatsnake.architecture.c_reflect.service.impl;

import com.fatsnake.architecture.c_reflect.dao.DemoDao;
import com.fatsnake.architecture.c_reflect.factory.BeanFactory;
import com.fatsnake.architecture.c_reflect.service.DemoService;

import java.util.List;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/15 14:01
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = BeanFactory.getDemoDao();


    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
