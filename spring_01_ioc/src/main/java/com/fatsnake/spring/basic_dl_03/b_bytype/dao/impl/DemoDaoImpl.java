package com.fatsnake.spring.basic_dl_03.b_bytype.dao.impl;

import com.fatsnake.spring.basic_dl_03.b_bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/16 10:57
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
