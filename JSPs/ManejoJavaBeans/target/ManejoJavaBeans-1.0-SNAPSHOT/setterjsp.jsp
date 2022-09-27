<%-- 
    Document   : setterjsp
    Created on : 16/04/2022, 2:05:42 p. m.
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Modifica un rectangulo</title>
    </head>
    <body>
        <h1>JSP Modifica un rectangulo!</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="request"/>
        Modificar los atributos
        <br/>
        <br/>
        <%
            int baseValor = 5;
            int alturaValor = 10;
            

//se modifican los valores
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>"/>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"/>
        <br/>
        Nuevo valor base : <%=baseValor%>
        <br/>
        Nuevo valor altura : <%=alturaValor%>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
