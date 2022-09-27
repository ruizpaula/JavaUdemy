
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y variables Implicitas</title>
    </head>
    <body>
        <h1>EL y variables Implicitas!</h1>
        <br/>
        <ul>
            <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <li>Nombre del cliente: ${header["User-Agent"]}</li>
            <li>Nombre id session : ${cookie.JSESSIONID.value}</li>
            <li>Nombre web server que se esta usando : ${pageContext.servletContext.serverInfo}</li>
            <li>Nombre valor parametro : ${param.usuario}</li>
            <br/>
            <a href="index.jsp">Regresar al inicio</a>
        </ul>
            
    </body>
</html>
