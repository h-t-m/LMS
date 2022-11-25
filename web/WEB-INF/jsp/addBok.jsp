<%--
  Created by IntelliJ IDEA.
  User: 15475
  Date: 2022/11/25
  Time: 2:42
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
    新图书添加成功<br>
  </div>
</h1>
<br><br><br>
<p>
<div style="text-align: center">
  图书 ID：${book.bookId}<br>
  书   名：${book.name}<br>
  馆藏数量：${book.number}<br>
  作   者：${book.author}<br>
  出 版 社：${book.publisher}<br>
  借阅次数：${book.brTimes}<br>
  购买时间：${book.buydate}<br>
</div>
</p>
</body>
</html>
