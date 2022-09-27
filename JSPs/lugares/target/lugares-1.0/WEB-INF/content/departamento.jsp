<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="dform.detalle" /></title>
    </head>
    <body>
        <h1><s:text name="dform.detalle" /></h1>
        <a href="<s:url action="listar"/>"><s:text name="dform.listado" /></a>
        <s:form action="guardarDepartamento">
            <s:hidden name="departamento.idDepartamento" />
            <s:submit action="guardarDepartamento" key="dform.enviar"/>
        </s:form>
    </body>
</html>
