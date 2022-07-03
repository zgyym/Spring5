package com.test;

import com.config.SpringConfig;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void test02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        System.out.println(userService);
        userService.add();
    }



}
