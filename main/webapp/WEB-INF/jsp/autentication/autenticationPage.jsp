<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    </head>
    <body>
        <center>
            <h1>
                 Pagina de Autenticação
            </h1>
            <br><br>
            <h2>
                ${message}
            </h2>
           <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/login/logout">Sair da Sessão</a>
        </center>
    </body>
</html>