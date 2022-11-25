<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 15475
  Date: 2022/11/21
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>

<body>
<div class="container">
    <header>
        <h1 id="title">图书管理系统</h1>
        <p id="description">武汉工程大学数据库实验成果展示</p>
    </header>
    <form id="login" action="user" method="post">
        <div class="form-block">
            <label id="uid-label" for="uid">学工号</label>
            <input id="uid"
                   class="box"
                   type="text"
                   name="uid"
                   placeholder="请在此输入学工号"
                   required>
        </div>
        <div class="form-block">
            <label id="psw-label" for="psw">密 码</label>
            <input id="psw"
                   class="box"
                   type="password"
                   name="passwd"
                   placeholder="请小心输入密码"
                   required>
        </div>
        <br><br>
        <div style="text-align: center">
            <button type="submit" class="btn">
                登  录
            </button>
        </div>
            <button class="cta" style="float: right" onclick="parent.location.href = 'resetpsw'">
                <span class="hover-underline-animation"> 忘记密码 </span>
                <svg viewBox="0 0 46 16" height="10" width="30" xmlns="http://www.w3.org/2000/svg" id="arrow-horizontal">
                    <path transform="translate(30)" d="M8,0,6.545,1.455l5.506,5.506H-30V9.039H12.052L6.545,14.545,8,16l8-8Z" data-name="Path 10" id="Path_10"></path>
                </svg>
            </button>
    </form>
</div>
<footer>
    @h-t-m 2022-2023 仅供作业展示 <a href="admin/login">后台登录</a>
</footer>
</body>
</html>
