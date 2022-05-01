package com.test;

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
        Book book = context.getBean("book", Book.class);
        book.test();
    }

    @Test
    public void testDemo03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext03.xml");
        Course myBean = context.getBean("myBean", Course.class); //配置文件里定义的是Mybean类型，但是实现了FactoryBean接口后，返回的是Course类型，所以传参时也应传Course.class
        System.out.println(myBean);
    }

}
