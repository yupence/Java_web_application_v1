package com;

import com.rz.dao.UserDao;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao userDao = new UserDao();
//        List<User> userList= userDao.findAll();
//        System.out.println(userList);

        if(userDao.UserExist("lisi","123")) {
            System.out.println("用户存在");
        }
        else{
            System.out.println("用户不存在");
        }
    }

}
