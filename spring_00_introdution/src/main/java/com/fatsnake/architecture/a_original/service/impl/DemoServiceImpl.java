package com.fatsnake.architecture.a_original.service.impl;

import com.fatsnake.architecture.a_original.dao.DemoDao;
import com.fatsnake.architecture.a_original.dao.impl.DemoDaoImpl;
import com.fatsnake.architecture.a_original.service.DemoService;

import java.util.List;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/15 13:18
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = new DemoDaoImpl();


    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
