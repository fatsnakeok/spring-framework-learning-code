package com.fatsnake.spring.bean_11.a_type.bean;

public class Child {

    private String wantToy = "ball";
    
    public String getWantToy() {
        return wantToy;
    }
    
    @Override
    public String toString() {
        return "Child{" + "wantToy='" + wantToy + '\'' + '}';
    }
}
