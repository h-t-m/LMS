<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="pers.h_t_m.LMS.pojo.Book" %><%--
  Created by IntelliJ IDEA.
  User: 15475
  Date: 2022/11/23
  Time: 0:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录</title>
    <link rel="stylesheet" type="text/css" href="css/user.css">
</head>
<body>
<div class="container">
    <header>
        <h1 id="title">欢迎登录，${user.name}</h1>
        <p id="description">武汉工程大学数据库实验成果展示</p>
    </header>
    <section id="userinfo">
        <div id="user1" style="float: left">
            <p>姓名：${user.name}</p>
            <p>性别：${user.sex}</p>
            <p>学工号：${user.uid}</p>
            <p>年龄：${user.age}</p>
        </div>
        <div id="user2" style="float: right">
            <p>年级：${user.grade}</p>
            <p>班级：${user.banji}</p>
            <p>专业：${user.major}</p>
            <p>手机号：${user.phone}</p>
        </div>
    </section>
    <h2>图书馆在线服务</h2>
    <section id="library">
        <h3>图书列表</h3>
        <table id="bookList">
            <tr>
                <th>图书编号</th>
                <th>书名</th>
                <th>馆藏数量</th>
                <th>作者</th>
                <th>出版社</th>
                <th>借阅次数</th>
                <th>购买时间</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${bookList}" var="list" varStatus="status">
                <tr>
                    <td>${list.bookId}</td>
                    <td>${list.name}</td>
                    <td>${list.number}</td>
                    <td>${list.author}</td>
                    <td>${list.publisher}</td>
                    <td>${list.brTimes}</td>
                    <td>${list.buydate}</td>
                    <td>
                        <form method="post" action="book">
                            <input name="uid" type="hidden" value="${user.uid}">
                            <input name="bookId" type="hidden" value="${list.bookId}">
                            <button>
                                借  书
                            </button>
                        </form>
                        <form method="post" action="book/return">
                            <input name="uid" type="hidden" value="${user.uid}">
                            <input name="bookId" type="hidden" value="${list.bookId}">
                            <button>
                                还  书
                            </button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <h3>借阅记录</h3>
        <table id="appointList">
            <tr>
                <th>图书编号</th>
                <th>书名</th>
                <th>借阅时间</th>
                <th>归还时间</th>
            </tr>
            <c:forEach items="${appointList}" var="list" varStatus="status">
                <tr>
                    <td>${list.bookId}</td>
                    <td>${list.book.name}</td>
                    <td>${list.appointTime}</td>
                    <c:choose>
                        <c:when test="${list.returnTime == NULL}">
                            <td>你还没有归还本书</td>
                        </c:when>
                        <c:otherwise>
                            <td>${list.returnTime}</td>
                        </c:otherwise>
                    </c:choose>
                </tr>
            </c:forEach>
        </table>
    </section>
</div>
</body>
</html>
