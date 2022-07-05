package com.test;

import com.pojo.Book;
import com.service.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {

    @Test
    public  void testAdd() {
        //有配置文件new ClassPathXmlApplicationContext()
        //完全注解开发new AnnotationConfigApplicationContext()
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        bookService.add(new Book("魔","正常"));
    }

    @Test
    public void testDel(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        bookService.del(7);
    }

    @Test
    public void testUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        Book book = new Book("言魔", "正常");
        book.setId(5);
        bookService.update(book);
    }

    @Test
    public void testSelectCount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        int count = bookService.selectCount();
        System.out.println(count);
    }

    @Test
    public void testPojo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        Book book = bookService.getBookById(5);
        System.out.println(book);
    }

    @Test
    public void testList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        List<Book> bookList = bookService.getBookList();
        System.out.println(bookList);
    }

    @Test
    public void testBatchAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        List<Object[]> list = new ArrayList<>();
        Object[] o1 = {"java","a"};
        Object[] o2 = {"C++","b"};
        Object[] o3 = {"MySQL","c"};

        list.add(o1);
        list.add(o2);
        list.add(o3);

        bookService.batchAdd(list);
    }

    @Test
    public void testBatchDel(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        List<Object[]> list = new ArrayList<>();
        //数字和字符串都可以   1 或者 ”1“
        Object[] o1 = {"5"};
        Object[] o2 = {"8"};

        list.add(o1);
        list.add(o2);

        bookService.batchDel(list);
    }

    @Test
    public void batchUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);

        List<Object[]> list = new ArrayList<>();
        Object[] o1 = {"C#","OK",12};
        Object[] o2 = {"PHP","OK",13};

        list.add(o1);
        list.add(o2);

        bookService.batchUpdate(list);

    }
}
