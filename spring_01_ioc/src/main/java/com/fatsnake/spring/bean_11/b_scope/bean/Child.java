package com.fatsnake.spring.bean_11.b_scope.bean;

//@Component
public class Child {
    
    private Toy toy;
    
    public void setToy(Toy toy) {
        this.toy = toy;
    }
    
    @Override
    public String toString() {
        return "Child{" + "toy=" + toy + '}';
    }
}
