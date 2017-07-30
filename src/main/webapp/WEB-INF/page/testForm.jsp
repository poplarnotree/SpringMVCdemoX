<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2017/7/30
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="format" method="post" action="test">
        <table>
            <tr>
                <td><label>日期类型:</label></td>
                <td><form:input path="birthday"/></td>
            </tr>
            <tr>
                <td><label>整数类型:</label></td>
                <td><form:input path="total"/></td>
            </tr>
            <tr>
                <td><label>百分数类型:</label></td>
                <td><form:input path="discount"/></td>
            </tr>
            <tr>
                <td><label>货币类型:</label></td>
                <td><form:input path="money"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
