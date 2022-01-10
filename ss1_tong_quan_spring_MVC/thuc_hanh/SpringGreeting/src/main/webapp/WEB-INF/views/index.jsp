<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 1/10/2022
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Greeting</title>
</head>
<body>
<h1>Hello Spring MVC</h1>
<form method="post">
  <input type="text" name="name" placeholder="moi nhap "/>
  <input type = "submit" id = "submit" value = "submit"/>

  <p>Hello: ${name}</p>
</form>
</body>
</html>