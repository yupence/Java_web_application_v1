
package com.rz.serlet;
import com.rz.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


public class UserServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String userName = req.getParameter("Username");
        String passWord = req.getParameter("passWord");
        UserDao userDao = new UserDao();
        try {
            if(userDao.UserExist(userName,passWord)) {
                resp.getWriter().write("welcome "+ userName);
            }
            else{
                resp.getWriter().write("The user doesn't exist or password is not correct");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
