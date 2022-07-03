package dao.impl;

import dao.UserDAO;

public class UserDAOImpl implements UserDAO {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
