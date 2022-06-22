package com.fatsnake.spring.basic_di_08.d_autowired;

import com.fatsnake.spring.basic_di_08.d_autowired.bean.Cat;
import com.fatsnake.spring.basic_di_08.d_autowired.bean.Dog;
import com.fatsnake.spring.basic_di_08.d_autowired.config.AutowiredConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Autowired 先拿属性对应的类型，去 IOC 容器中找 Bean ，如果找到了一个，直接返回；如果找到多个类型一样的 Bean ，
 * 把属性名拿过去，跟这些 Bean 的 id 逐个对比，如果有一个相同的，直接返回；如果没有任何相同的 id 与要
 * 注入的属性名相同，则会抛出 NoUniqueBeanDefinitionException 异常。
 * <p>
 * 自动注入
 */
public class AutowiredApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AutowiredConfiguration.class);

        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }
}
