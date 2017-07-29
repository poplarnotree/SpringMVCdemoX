<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2017/7/29
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="user" method="post" action="login">
        <table>
            <tr>
                <td>登录名:</td>
                <td><form:input path="loginname"/></td>
                <td><form:errors path="loginname" cssStyle="color: red"/></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><form:password path="password"/></td>
                <td><form:errors path="password" cssStyle="color: red"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
