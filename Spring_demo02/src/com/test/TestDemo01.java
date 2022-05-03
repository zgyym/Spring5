package com.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.autowire.Emp;
import com.bean.Order;
import com.collectiontype.Book;
import com.collectiontype.Course;
import com.collectiontype.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo01 {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext01.xml");
        Student student = context.getBean("student", Student.class);
        student.test();
    }

    @Test
    public void testDemo02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext02.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testDemo03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext03.xml");
        Course myBean = context.getBean("myBean", Course.class); //配置文件里定义的是Mybean类型，但是实现了FactoryBean接口后，返回的是Course类型，所以传参时也应传Course.class
        System.out.println(myBean);
    }

    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext04.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("第四步：获取创建bean实例对象");
        System.out.println(order);

        //ApplicationContext中没有close方法
        ((ClassPathXmlApplicationContext)context).close();
    }


    @Test
    public void testBean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext05.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

    }


    @Test
    public void testBean3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext06.xml");
        DruidDataSource dataSourse = context.getBean("dataSourse", DruidDataSource.class);
        System.out.println(dataSourse);

    }
}
