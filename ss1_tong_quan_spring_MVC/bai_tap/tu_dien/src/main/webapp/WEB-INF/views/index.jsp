<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 1/10/2022
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post">
    <input type="text" name="keyword" placeholder="moi nhap "/>
    <input type = "submit" id = "submit" value = "submit"/>

    <p>${result}</p>
</form>
</body>
</html>