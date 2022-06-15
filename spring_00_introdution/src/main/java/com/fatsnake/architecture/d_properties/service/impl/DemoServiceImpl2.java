package com.fatsnake.architecture.d_properties.service.impl;


import com.fatsnake.architecture.d_properties.dao.DemoDao;
import com.fatsnake.architecture.d_properties.factory.BeanFactory;
import com.fatsnake.architecture.d_properties.service.DemoService;

import java.util.List;

public class DemoServiceImpl2 implements DemoService {
    
    DemoDao demoDao = BeanFactory.getDemoDao();
    
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
