package com.fatsnake.architecture.b_factory.factory;

import com.fatsnake.architecture.b_factory.service.DemoService;
import com.fatsnake.architecture.b_factory.dao.DemoDao;
import com.fatsnake.architecture.b_factory.dao.impl.DemoMySQLDao;
import com.fatsnake.architecture.b_factory.service.impl.DemoServiceImpl;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/15 13:56
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class BeanFactory {

    public static DemoService getDemoService() {
        return new DemoServiceImpl();
    }

    public static DemoDao getDemoDao() {


//         return new DemoDaoImpl();

        return new DemoMySQLDao();
    }


}
