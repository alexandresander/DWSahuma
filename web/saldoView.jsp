<%-- 
    Document   : saldoView
    Created on : 17/06/2015, 18:38:06
    Author     : alexandre
--%>

<%@page import="Model.Conta"%>
<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saldo</title>
    </head>
    <body style="background-color:lightgreen">
        <% Conta conta = (Conta)session.getAttribute("conta"); %>
        <h1>Seu saldo é R$<%=Double.toString(conta.getSaldo())%></h1>
    </body>
</html>
