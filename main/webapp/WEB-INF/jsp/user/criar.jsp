<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
    <body>
        <center>
            <h1>
                 Criar Usuário
            </h1>

            ${message}
            <br><br>
            <form method="post" action="<%=request.getContextPath()%>/user/criar">
                Login do Usuário:
                <input type="text" name="name">
                <br><br>
                Email do Usuário:
                <input type="email" name="email">
                <br><br>
                Senha do Usuário:
                <input type="password" name="password">
                <br><br>
                <input class="btn btn-primary" type="submit" value="Salvar"> ou <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/login/loginPage">Login</a>
            </form>
            <br><br>
        </center>
    </body>
</html>