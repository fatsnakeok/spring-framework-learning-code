package com.fatsnake.spring.bean_11.a_type.bean;

import org.springframework.beans.factory.FactoryBean;


/**
 * Bean 的创建需要指定一些策略，或者依赖特殊的场景来分别创建，也或者一个对象的创建过程太复杂，
 * 使用 xml 或者注解声明也比较复杂。这种情况下，如果还是使用普通的创建 Bean 方式，以咱现有的认知就搞不定了。于是，
 * SpringFramework 在一开始就帮我们想了办法，可以借助 FactoryBean 来使用工厂方法创建对象。
 */
public class ToyFactoryBean implements FactoryBean<Toy> {

    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了。。。");
    }

    private Child child;

    // 返回创建的对象
    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                return null;
        }
    }

    // 返回创建的对象的类型（即泛型类型）
    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
