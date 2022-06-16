package com.fatsnake.architecture.c_reflect.e_cachefactory.dao.impl;



import com.fatsnake.architecture.c_reflect.e_cachefactory.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {
    
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
