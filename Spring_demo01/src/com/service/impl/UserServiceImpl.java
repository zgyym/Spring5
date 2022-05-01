package com.service.impl;

import com.dao.UserDAO;
import com.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Override
    public void add() {
        System.out.println("service add ......");
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
