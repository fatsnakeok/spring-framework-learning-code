package com.fatsnake.architecture.a_original.dao.impl;

import com.fatsnake.architecture.a_original.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/15 11:08
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaaa","bbbb","cccc");
    }
}
