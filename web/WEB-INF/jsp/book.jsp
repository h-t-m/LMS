<%--
  Created by IntelliJ IDEA.
  User: 15475
  Date: 2022/11/24
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书</title>
    <link rel="stylesheet" type="text/css" href="css/user.css">
</head>
<body>
<br><br><br><br><br><br>
<h1>
    <div style="text-align: center">
        借书成功<br>
        <p style="font-size: 50%">你的学工号为：${appointDto.appointment.uid}，请按时还书</p>
    </div>
</h1>
<br><br><br>
<p>
    <div style="text-align: center">
    书   名：${appointDto.appointment.book.name}<br>
    图书 ID：${appointDto.appointment.bookId}<br>
    剩余数量：${appointDto.appointment.book.number}<br>
    借阅时间：${appointDto.appointment.appointTime}<br>
    </div>
</p>
</body>
</html>
