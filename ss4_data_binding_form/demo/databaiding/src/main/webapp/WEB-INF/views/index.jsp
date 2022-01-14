<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 1/12/2022
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/display" method="post" modelAttribute="user">
    <p>Name:</p>
    <form:input type="text" path="name"/>
    <p>Age:</p>
    <form:input type="text" path="age"/>
    <p>Address:</p>
    <form:input type="text" path="address"/>
    <button type="submit">create</button>
</form:form>
</body>
</html>
