<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <center>
        <head>
            <title>Pagina de Login</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        </head>
        <body>
            <h1>Login do Usuário:</h1>
            <br><br>
            ${message}
            <br><br>
            <form method="post" action="<%=request.getContextPath()%>/login/loginPage">
                Email do usuário:
                <input type="email" name="email">
                <br><br>
                Senha do usuário:
                <input type="password" name="password">
                <br><br>
                <input class="btn btn-primary" type="submit" value="Login"> ou <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/user/criar">Cadastrar Usuário</a>
            </form>
        </body>
    </center>
</html>
