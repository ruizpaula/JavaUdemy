<%-- 
    Document   : getterjsp
    Created on : 16/04/2022, 2:06:40 p. m.
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Leer valores del javabeans</title>
    </head>
    
    <body>
        <h1>SP Leer valores del javabeans!</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="request"/>
        <br/>
        Valor base : <jsp:getProperty name="rectangulo" property="base"/>
        <br/>
        Valor altura : <jsp:getProperty name="rectangulo" property="altura"/>
        <br>
        Valor area del rectangulo : <jsp:getProperty name="rectangulo" property="area"/>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
