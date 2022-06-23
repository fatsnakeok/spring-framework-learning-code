package com.fatsnake.spring.basic_di_08.e_jsr250.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Bird {

    /**
     * @Resource 注解相当于标注 @Autowired 和 @Qualifier
     * 是直接按照属性名 / Bean的名称注入`
     */
    @Resource(name = "master")
    private Person person;
    
    @Override
    public String toString() {
        return "Bird{" + "person=" + person + '}';
    }
}
