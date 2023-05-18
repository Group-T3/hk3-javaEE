<%--
  Created by IntelliJ IDEA.
  User: ngoquangdai
  Date: 18/05/2023
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div style="text-align: center">
    <h1>Admin Login</h1>
    <form action="login" method="post">
        <label for="email">Email:</label>
        <input name="email" size="30" />
        <br><br>
        <label for="password">Password:</label>
        <input type="password" name="password" size="30" />
        <br style="color: red">${message}
        <br><br>
        <button type="submit">Login</button>
    </form>
</div>
</body>
</html>
