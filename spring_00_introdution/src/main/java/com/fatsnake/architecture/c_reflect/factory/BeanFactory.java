package com.fatsnake.architecture.c_reflect.factory;

import com.fatsnake.architecture.c_reflect.dao.DemoDao;
import com.fatsnake.architecture.c_reflect.dao.impl.DemoMySQLDao;
import com.fatsnake.architecture.c_reflect.service.DemoService;
import com.fatsnake.architecture.c_reflect.service.impl.DemoServiceImpl;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/15 13:56
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class BeanFactory {

    public static DemoService getDemoService() {
//        return new DemoServiceImpl();
        try {
            return (DemoService)  Class.forName("com.fatsnake.architecture.c_reflect.service.impl.DemoServiceImpl")
                    .newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DemoService instantiation error, cause: " + e.getMessage());
        }
    }

    public static DemoDao getDemoDao() {
//         return new DemoDaoImpl();
//        return new DemoMySQLDao();
        try {
            return (DemoDao)  Class.forName("com.fatsnake.architecture.c_reflect.dao.impl.DemoDaoImpl")
                    .newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
        }

    }
}
