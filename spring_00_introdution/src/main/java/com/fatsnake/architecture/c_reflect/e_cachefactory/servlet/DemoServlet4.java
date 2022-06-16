package com.fatsnake.architecture.c_reflect.e_cachefactory.servlet;


import com.fatsnake.architecture.c_reflect.e_cachefactory.service.DemoService;
import com.fatsnake.architecture.c_reflect.e_cachefactory.factory.BeanFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo4")
public class DemoServlet4 extends HttpServlet {
    
    DemoService demoService = (DemoService) BeanFactory.getBean("demoService");
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll().toString());
    }
}
