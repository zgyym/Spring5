package com.dao.impl;

import com.dao.UserDAO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO {

    @Value(value = "言魔")
    private String name;

    @Override
    public void add() {
        System.out.println("DAO add --------");
    }
}
