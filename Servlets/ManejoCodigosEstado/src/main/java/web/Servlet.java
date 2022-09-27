
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void  doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException{
        //simulador de valores correctos
        String usuarioOK = "juan";
        String passwordOK = "123";
        //si el usuario proporciono esos datos todo es OK
        //sino mostrara un cabecero donde le informara que el usuario no esta autorizado para solicitar este recurso
        
        
        // se recibe los inputs del html 
        String usuario = request.getParameter(usuarioOK);
        String password = request.getParameter(passwordOK);
        
        PrintWriter out = response.getWriter();
        
        if(usuarioOK.equals(usuario) && passwordOK.equals(password)){
            out.print("<h1>");
            out.print("Datos completos");
            out.print("<br> Usuarios" + usuario);
            out.print("<br> Password" + password);
            out.print("</h1> ");
        }else{
            response.sendError(response.);
        }
    }
}
