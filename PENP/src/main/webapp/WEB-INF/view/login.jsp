<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/22
  Time: 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="/meeting/loginController" method="post">--%>
<form action="/meeting/login/loginController" method="post">
id:<input type="number" name="userId"><br>
password:<input type="text" name="userPassword"><br>
<input type="submit" value="登录">
</form>
</body>
</html>
