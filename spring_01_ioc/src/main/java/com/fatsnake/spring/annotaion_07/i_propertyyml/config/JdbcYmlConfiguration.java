package com.fatsnake.spring.annotaion_07.i_propertyyml.config;

import com.fatsnake.spring.annotaion_07.i_propertyyml.factory.YmlPropertySourceFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.fatsnake.spring.annotaion_07.i_propertyyml.bean")
@PropertySource(value = "classpath:propertysource/jdbc.yml", factory = YmlPropertySourceFactory.class)
public class JdbcYmlConfiguration {
    
}
