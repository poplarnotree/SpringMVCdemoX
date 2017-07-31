<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2017/7/29
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

数据格式化/Format
<hr>
    <form:form modelAttribute="format" method="post" action="">
        <table>
            <tr>
                <td>日期类型:</td>
                <td><form:input path="birthday"/></td>
            </tr>
            <tr>
                <td>整数类型:</td>
                <td><form:input path="total"/></td>
            </tr>
            <tr>
                <td>百分数类型:</td>
                <td><form:input path="discount"/></td>
            </tr>
            <tr>
                <td>货币类型:</td>
                <td><form:input path="money"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
