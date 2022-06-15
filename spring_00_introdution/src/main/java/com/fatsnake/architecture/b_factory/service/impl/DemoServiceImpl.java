package com.fatsnake.architecture.b_factory.service.impl;

import com.fatsnake.architecture.b_factory.dao.DemoDao;
import com.fatsnake.architecture.b_factory.factory.BeanFactory;
import com.fatsnake.architecture.b_factory.service.DemoService;

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
