<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2017/7/31
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>欢迎${requestScope.user.username}</h3>
<h3>你的账号:${requestScope.user.loginname}</h3>
<h3>你的密码:${requestScope.user.password}</h3>
<h3>你的年龄:${requestScope.user.age}</h3>
<h3>你的生日:<fmt:formatDate value="${requestScope.user.birthday}" pattern="yyyy年MM月dd日"/> </h3>
<h3>邮箱:${requestScope.user.email}</h3>
<h3>电话:${requestScope.user.phone}</h3>
</body>
</html>
