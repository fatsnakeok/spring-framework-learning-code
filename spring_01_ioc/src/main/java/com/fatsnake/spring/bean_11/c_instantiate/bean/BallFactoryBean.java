package com.fatsnake.spring.bean_11.c_instantiate.bean;

import org.springframework.beans.factory.FactoryBean;

public class BallFactoryBean implements FactoryBean<Ball> {
    
    @Override
    public Ball getObject() {
        return new Ball();
    }
    
    @Override
    public Class<Ball> getObjectType() {
        return Ball.class;
    }
}
