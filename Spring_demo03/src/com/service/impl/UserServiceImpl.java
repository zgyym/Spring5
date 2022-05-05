package com.service.impl;

import com.dao.UserDAO;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//在注解里面 value 属性值可以省略不写，
//默认值是类名称，首字母小写
//@Component(value = "userService")   //<bean id = "userService" class = "..."></bean>
@Service(value = "userService")
public class UserServiceImpl implements UserService {

   /* @Autowired
    @Qualifier(value = "userDAO")*/
    //@Resource       //根据类型注入
    @Resource(name = "userDAO")       //根据属性名称注入
    private UserDAO userDAO;
    //不需要添加set()方法

    public void add(){
        System.out.println("service add----------");
        userDAO.add();
    }
}
