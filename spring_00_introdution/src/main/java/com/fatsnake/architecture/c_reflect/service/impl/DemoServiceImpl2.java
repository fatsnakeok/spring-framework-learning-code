package com.fatsnake.architecture.c_reflect.service.impl;


import com.fatsnake.architecture.c_reflect.dao.DemoDao;
import com.fatsnake.architecture.c_reflect.factory.BeanFactory;
import com.fatsnake.architecture.c_reflect.service.DemoService;

import java.util.List;

public class DemoServiceImpl2 implements DemoService {
    
    DemoDao demoDao = BeanFactory.getDemoDao();
    
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
