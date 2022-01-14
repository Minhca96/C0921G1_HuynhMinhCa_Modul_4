<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form action="show" method="post" modelAttribute="login">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><label>Language:</label></td>
                <td>
                    <form:select path="language" >
                        <form:option value="English"/>
                        <form:option value="Vietnamese"/>
                        <form:option value="Japanese"/>
                        <form:option value="Japanese"/>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td><label>Page Size:</label></td>
                <td>
                    <span>show</span>
                    <form:select path="pageSize" >
                        <form:option value="5"/>
                        <form:option value="10"/>
                        <form:option value="15"/>
                        <form:option value="25"/>
                        <form:option value="50"/>
                        <form:option value="100"/>
                    </form:select>
                    <span>emails per page</span>
                </td>
            </tr>

            <tr>
                <td><label>Spams Filter :</label></td>
                <td>
                    <span>Spams Filter Size</span>
                    <form:checkbox path="spamsFilter" value="enable spams filters"/>
                <span>enable spams filters</span>
                </td>

            </tr>

            <tr>
                <td><label>Signature Filter :</label></td>
                <td>
                    <form:textarea path="signature" cols="3" rows="4"/>

                </td>

            </tr>

            <tr>
                <td><button type="submit">update</button></td>

                <td><button type="reset">cancel</button></td>

            </tr>

        </table>
    </fieldset>
</form:form>
</body>
</html>
