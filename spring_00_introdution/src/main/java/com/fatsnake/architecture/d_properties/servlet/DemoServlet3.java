package com.fatsnake.architecture.d_properties.servlet;


import com.fatsnake.architecture.d_properties.factory.BeanFactory;
import com.fatsnake.architecture.d_properties.service.DemoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2")
public class DemoServlet3 extends HttpServlet {
    
    DemoService demoService = BeanFactory.getDemoService();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll().toString());
    }
}
