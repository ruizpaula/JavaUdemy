<%-- 
    Document   : VistaPersona
    Created on : 12/01/2022, 3:09:15 p. m.
    Author     : pruiz
--%>


<%@page import="Modelo.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controlador.Persona"%>
<%@page import="static Modelo.Conexion.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>

<%
    PersonaDAO personaDao = new PersonaDAO();
    List<Persona> personas = personaDao.seleccionar();

%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Registros Persona</h1>
        <form action="">
            <table border="1px">
                <tr>
                    <td>Id Usuario</td>
                    <td>Nombre</td>
                    <td>Apellido</td>
                    <td>correo</td>
                    <td>Telefono</td>
                </tr>
                <%                    for (Persona persona : personas) {

                %>

                <tr>

                    <td><%=persona%>&nbsp;</td>
                </tr>

                <%
                    }
                %>
            </table>
            <input name="" type="submit" >
        </form>
    </body>
</html>
