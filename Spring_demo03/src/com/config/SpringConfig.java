package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration          //作为配置类来替代xml配置文件
@ComponentScan(basePackages = {"com.service","com.dao"})
public class SpringConfig {
}
