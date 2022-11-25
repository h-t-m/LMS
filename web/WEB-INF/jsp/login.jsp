<%--
  Created by IntelliJ IDEA.
  User: 15475
  Date: 2022/11/24
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台登录</title>
    <link rel="stylesheet" type="text/css" href="../css/login.css">
</head>
<body>
<div class="container">
    <header>
        <h1 id="title">图书管理系统 - 后台登录</h1>
        <p id="description">武汉工程大学数据库实验成果展示</p>
    </header>
    <form id="login" action="../admin" method="post">
        <div class="form-block">
            <input id="psw"
                   class="box"
                   type="password"
                   name="passwd"
                   placeholder="请输入后台管理员密码"
                   required>
        </div>
        <br><br>
        <div style="text-align: center">
            <button type="submit" class="btn">
                登  录
            </button>
        </div>
    </form>
</div>
</body>
</html>
