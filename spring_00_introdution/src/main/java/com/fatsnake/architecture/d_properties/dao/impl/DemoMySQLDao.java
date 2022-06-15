package com.fatsnake.architecture.d_properties.dao.impl;


import com.fatsnake.architecture.d_properties.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoMySQLDao implements DemoDao {
    
    @Override
    public List<String> findAll() {
        // jdbc operations ......
        System.out.println("DemoMySQLDao findAll run ......");
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
