<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="dform.titulo" /></title>
    </head>
    <body>
        <h1><s:text name="dform.titulo" /></h1>
        <a href="<s:url action="agregarDepartamento"/>"><s:text name="dform.agregar" /></a>
        <s:if test="departamentos.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.idDepartamento" /></th>
                        <th><s:text name="p.nombreDepartamento" /></th>
                        <th><s:text name="pform.editar" /></th>
                        <th><s:text name="pform.eliminar" /></th>
                    </tr>
                    <s:iterator value="departamentos">
                        <tr>
                            <td><s:property value="idPersona" /></td>
                            <td><s:property value="nombre" /></td>
                            <td>
                                <s:url action="editarDepartamento" var="editarURL">
                                    <s:param name="departamento.idDepartamento" value="%{idDepartamento}"></s:param>
                                </s:url>
                                <s:a href="%{editarURL}"><s:text name="dform.editar" /></s:a>
                                </td>
                                <td>
                                <s:url action="eliminarDepartamento" var="eliminarURL">
                                    <s:param name="departamento.idDepartamento" value="%{idDepartamento}"></s:param>
                                </s:url>
                                <s:a href="%{eliminarURL}"><s:text name="dform.eliminar" /></s:a>
                                </td>
                            </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>
    </body>
</html>


