package com.fatsnake.architecture.a_original.servlet;

import com.fatsnake.architecture.a_original.service.DemoService;
import com.fatsnake.architecture.a_original.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/15 13:20
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */

@WebServlet(urlPatterns = "/demo1")
public class DemoServlet1 extends HttpServlet {

    DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll().toString());
    }
}
