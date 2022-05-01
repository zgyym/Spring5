package com.test;

import com.bean.Emp;
import com.pojo.Book;
import com.pojo.Orders;
import com.pojo.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring02 {

    @Test
    public void testAdd(){

        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("a" +
                "pplicationContext02.xml");

        //创建对象
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testBean(){

        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext03.xml");

        //创建对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
