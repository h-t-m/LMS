<%--
  Created by IntelliJ IDEA.
  User: 15475
  Date: 2022/11/25
  Time: 1:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加成功</title>
  <link rel="stylesheet" type="text/css" href="../css/user.css">
</head>
<body>
<br><br><br><br><br><br>
<h1>
  <div style="text-align: center">
    新用户添加成功<br>
  </div>
</h1>
<br><br><br>
<p>
<div style="text-align: center">
  学工号：${user.uid}<br>
  姓名：${user.name}<br>
  性别：${user.sex}<br>
  年龄：${user.age}<br>
  年级：${user.grade}<br>
  班级：${user.banji}<br>
  专业：${user.major}<br>
  手机号：${user.phone}<br>
  密码：${user.password}<br>
</div>
</p>
</body>
</html>
