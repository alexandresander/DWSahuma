<%-- 
    Document   : index
    Created on : 12/06/2015, 20:22:53
    Author     : alexandre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BANCO SAHUMA</title>
    </head>
    <body style=background-color:lightgreen>
    <center><h1>SAHUMA<hr></h1></center>
    <h2>LOGIN</h2>
    <form action=Login method=post>
        Agencia: 
        <br>
        <input type=number name=agencia>
        <br>
        Conta:
        <br>
        <input type=text name=conta>
        <br><br>
        <input type=submit value=enviar>
    </form>
</body>
</html>
