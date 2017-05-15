<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h1>Hello everybody!</h1>
    <a href="/user/">Link only for user</a><br>
    <a href="/admin/">Link only for admin</a><br>
    <form action="/j_spring_security_logout" method="post" id="logoutForm">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">
            Выход
        </button>
    </form>
</body>
</html>