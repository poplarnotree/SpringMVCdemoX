<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2017/7/29
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="user" method="post" action="register1">
        <table>
            <tr>
                <td>登录名:</td>
                <td><form:input path="loginname"/></td>
                <td><form:errors path="loginname" cssStyle="color: red"/></td>
            </tr>
            <tr>
                <td>密&nbsp;码:</td>
                <td><form:password path="password"/></td>
                <td><form:errors path="password" cssStyle="color: red"/></td>
            </tr>
            <tr>
                <td>真实姓名:</td>
                <td><form:input path="username"/></td>
                <td><form:errors path="username" cssStyle="color:red;"/> </td>
            </tr>
            <tr>
                <td>年&nbsp;龄:</td>
                <td><form:input path="age"/></td>
                <td><form:errors path="age" cssStyle="color: red"/> </td>
            </tr>
            <tr>
                <td>邮&nbsp;箱:</td>
                <td><form:input path="email"/></td>
                <td><form:errors path="email" cssStyle="color: red"/> </td>
            </tr>
            <tr>
                <td>生&nbsp;日:</td>
                <td><form:input path="birthday"/></td>
                <td><form:errors path="birthday" cssStyle="color: red"/> </td>
            </tr>
            <tr>
                <td>电话:</td>
                <td><form:input path="phone"/></td>
                <td><form:errors path="phone" cssStyle="color: red"/> </td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
