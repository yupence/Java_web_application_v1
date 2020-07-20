package com.rz.util;
import com.rz.bean.User;
import com.rz.dao.UserDao;


import java.sql.*;
import java.util.List;

public class Testjdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        List<User> userList = userDao.findAll();
        System.out.println(userList);

    }


}
