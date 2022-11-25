<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 15475
  Date: 2022/11/23
  Time: 0:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理页面</title>
    <link rel="stylesheet" type="text/css" href="css/admin.css">
</head>
<body>
<div class="container">
    <header>
        <h1 id="title">后台管理界面，请谨慎操作</h1>
        <p id="description">武汉工程大学数据库实验成果展示</p>
    </header>
    <h2>后台管理服务</h2>
    <section id="admin">
        <h3>现有图书列表</h3>
        <table id="bookList">
            <tr>
                <th>图书编号</th>
                <th>书名</th>
                <th>馆藏数量</th>
                <th>作者</th>
                <th>出版社</th>
                <th>借阅次数</th>
                <th>购买时间</th>
                <th>修改</th>
                <th>删除</th>
            </tr>
            <c:forEach items="${bookList}" var="list" varStatus="status">
                <tr>
                    <form method="post" action="admin/updateBook">
                        <td>${list.bookId}</td>
                        <input name="bookId" value="${list.bookId}" type="hidden">
                        <td><input name="name" value="${list.name}"></td>
                        <td><input name="number" value="${list.number}"></td>
                        <td><input name="author" value="${list.author}"></td>
                        <td><input name="publisher" value="${list.publisher}"></td>
                        <td><input name="brTimes" value="${list.brTimes}" disabled="disabled"></td>
                        <td><input name="buydate" value="${list.buydate}" disabled="disabled"></td>
                        <td>
                            <button>
                                确认修改
                            </button>
                        </td>
                    </form>
                    <form method="post" action="admin/deleteBook">
                        <input name="bookId" value="${list.bookId}" type="hidden">
                        <td bgcolor="red">
                            <button>
                                直接删除
                            </button>
                        </td>
                    </form>
                </tr>
            </c:forEach>
            <tr>
                <form method="post" action="admin/addBook">
                    <td><input name="bookId"></td>
                    <td><input name="name"></td>
                    <td><input name="number"></td>
                    <td><input name="author"></td>
                    <td><input name="publisher"></td>
                    <td><input name="brTimes" disabled="disabled"></td>
                    <td><input name="buydate" disabled="disabled"></td>
                    <td>
                        <button>
                            确认增加
                        </button>
                    </td>
                    <td bgcolor="red">
                        <button type="button">
                            <input name="bookId" value="无法删除" disabled="disabled">
                        </button>
                    </td>
                </form>
            </tr>
        </table>
        <h3>现有用户列表</h3>
        <table id="userList">
            <tr>
                <th>学工号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>年级</th>
                <th>班级</th>
                <th>专业</th>
                <th>手机号</th>
                <th>密码</th>
                <th>修改</th>
                <th>删除</th>
            </tr>
            <c:forEach items="${userList}" var="list" varStatus="status">
                <tr>
                    <form method="post" action="admin/updateUser">
                        <td>${list.uid}</td>
                        <input name="uid" value="${list.uid}" type="hidden">
                        <td><input name="name" value="${list.name}"></td>
                        <td><input name="sex" value="${list.sex}"></td>
                        <td><input name="age" value="${list.age}"></td>
                        <td><input name="grade" value="${list.grade}"></td>
                        <td><input name="banji" value="${list.banji}"></td>
                        <td><input name="major" value="${list.major}"></td>
                        <td><input name="phone" value="${list.phone}"></td>
                        <td><input name="password" value="${list.password}"></td>
                        <td>
                            <button>
                                确认修改
                            </button>
                        </td>
                    </form>
                    <form method="post" action="admin/deleteUser">
                        <input name="uid" value="${list.uid}" type="hidden">
                        <td bgcolor="red">
                            <button>
                                直接删除
                            </button>
                        </td>
                    </form>
                </tr>
            </c:forEach>
            <tr>
                <form method="post" action="admin/addUser">
                    <td><input name="uid"></td>
                    <td><input name="name"></td>
                    <td><input name="sex"></td>
                    <td><input name="age"></td>
                    <td><input name="grade"></td>
                    <td><input name="banji"></td>
                    <td><input name="major"></td>
                    <td><input name="phone"></td>
                    <td><input name="password"></td>
                    <td>
                        <button>
                            确认增加
                        </button>
                    </td>
                    <td bgcolor="red">
                        <button type="button">
                            <input name="uid" value="无法删除" disabled="disabled">
                        </button>
                    </td>
                </form>
            </tr>
        </table>
        <h3>借阅记录</h3>
        <table id="appointList">
            <tr>
                <th>图书编号</th>
                <th>书名</th>
                <th>借阅人学工号</th>
                <th>借阅时间</th>
                <th>归还时间</th>
            </tr>
            <c:forEach items="${appointList}" var="list" varStatus="status">
                <tr>
                    <td>${list.bookId}</td>
                    <td>${list.book.name}</td>
                    <td>${list.uid}</td>
                    <td>${list.appointTime}</td>
                    <c:choose>
                        <c:when test="${list.returnTime == NULL}">
                            <td>该用户还没有归还本书</td>
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
