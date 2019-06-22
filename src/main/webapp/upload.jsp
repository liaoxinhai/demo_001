<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/19 0019
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="appcom/textpath.jsp" %>
>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="file/file1.do" method="post" enctype="multipart/form-data">

    <input name="file" type="file" id="file" value="C:\Users\Administrator\Desktop\about.jpg">
    <input type="submit" value="upload">
</form>
</body>
</html>
