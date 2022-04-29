package com.test;

import com.pojo.Book;
import com.pojo.Orders;
import com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){

        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("a" +
                "pplicationContext01.xml");

        //创建对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook(){

        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("a" +
                "pplicationContext01.xml");

        //创建对象
        Book book = context.getBean("book", Book.class);
        book.testDemo();
    }


    @Test
    public void testOrder(){

        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("a" +
                "pplicationContext01.xml");

        //创建对象
        Orders order = context.getBean("orders", Orders.class);
        order.ordersTest();
    }
}
