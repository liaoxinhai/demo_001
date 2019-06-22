<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/21 0021
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="use/add.do" method="post" enctype="multipart/form-data">

    <input name="uid" value="1">
    <input name="name" value="jkjk">
    <input name="pass" value="12">
    <input type="submit" value="add">
</form>
<h3>添加的用户为：${userui}</h3>

现在的用户有：${user}
</body>
</html>
