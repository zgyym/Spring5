package test;

import aop.User;
import config.ConfigAOP;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

    @Test
    public void testBefore(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAOP.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
