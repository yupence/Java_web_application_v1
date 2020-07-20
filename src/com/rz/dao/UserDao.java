package com.rz.dao;

import com.rz.bean.User;
import com.rz.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> findAll() throws SQLException, ClassNotFoundException {
        List<User> userList = new ArrayList<>();
        Connection connection = DBUtil.getConnection();
        String sql = "select * from tb_user";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                userList.add(user);
        }
        DBUtil.closeAll(resultSet,statement,connection);
        return userList;
    }
    public boolean UserExist(String userName,String passWord) throws SQLException, ClassNotFoundException {
        Connection connection = DBUtil.getConnection();
        String sql = "select password from tb_user where username = "+"'"+userName+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next())
        {
            String DBpassWord = resultSet.getString(1);
            if (DBpassWord.equals(passWord))
                return true;
        }
        return false;
    }
}
