<%-- 
    Document   : index2
    Created on : 17/06/2015, 17:09:26
    Author     : alexandre
--%>

<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body style="background-color:lightgreen">
        <h3> Seu nome está correto? <br>
            <% Cliente logado = (Cliente) session.getAttribute("cliente");%>
            <%= logado.getNome()%>
            <form action="index2.jsp" method="post">
                <input type="radio" name="confirma" value="0"> Sim, este sou eu! 
                <input type="radio" name="confirma" value="1"> Não, não sou eu!  <br><br>
                <input type="submit" value="OK">
            </form>
            <%
                if (request.getParameter("confirma") != null) {
                    int opcao = Integer.parseInt(request.getParameter("confirma"));
                    if (opcao == 0) {
            %>

            <h3>DIGITE SUA SENHA:</h3>
            <form action="index2.jsp" method="post">
                Senha: <br><input type=password name=senha>
                <br><br><input type=submit value=enviar>
            </form>

            <% } else if (opcao == 1) { %>
            <h3>Ligue para 0800 666 para maiores informações.</h3>
            <% }

                }%>

            <% if (request.getParameter("senha") != null) {
                    if (request.getParameter("senha").equals(logado.getSenha())) {
                        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/menu.jsp");
                        if (dispatcher != null) {
                            dispatcher.forward(request, response);
                        }
                    } else { %> 
            <h3> Senha incorreta! Verifique seu nome e tente outra vez! </h3>
            <%}
                }%>
    </body>
</html>
