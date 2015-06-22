<%-- 
    Document   : Menu
    Created on : 17/06/2015, 17:50:36
    Author     : alexandre
--%>

<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body style="background-color:lightgreen">
        <% Cliente logado = (Cliente)session.getAttribute("cliente"); %>
        <h1>Bem-Vindo <%=  logado.getNome().toUpperCase()%></h1>
        <a href="saldoView.jsp"><input type="button" value="SALDO"></a><br>
        <br><a href="extrato"><input type="button" value="EXTRATO"></a><br>
        <br><a href="deposito"><input type="button" value="DEPÓSITO"></a><br>
        <br><a href="saqueView"><input type="button" value="SAQUE"></a><br>
        <br><a href="transferencia"><input type="button" value="TRANSFERÊNCIA"></a><br>
        <br><a href="investimento"><input type="button" value="INVESTIMENTO"></a><br>
    </body>
</html>
