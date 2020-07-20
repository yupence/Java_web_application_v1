<%--
  Created by IntelliJ IDEA.
  User: yupence
  Date: 20/7/20
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/hello" method="get" autocomplete="on">
    userName:<input type="text" name="Username" /><br />
    password: <input type="password" name="passWord" autocomplete="off" /><br />
    <input type="submit" value="登录" onclick="window.location.href=/success"/>
  </form>
  </body>
</html>
