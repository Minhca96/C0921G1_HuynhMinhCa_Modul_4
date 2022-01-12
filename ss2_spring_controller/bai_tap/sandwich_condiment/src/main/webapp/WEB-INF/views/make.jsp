<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 1/12/2022
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Sandwich condiment</th>

    </tr>
<c:forEach items="${show}" var="s">
    <tr>
        <td>${s}</td>

    </tr>
</c:forEach>
</table>
</body>
</html>
