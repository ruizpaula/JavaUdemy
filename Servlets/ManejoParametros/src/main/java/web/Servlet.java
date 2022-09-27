
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    //sobreescribir el metodo post
    // metodo doPost para procesar la inf
    protected void doPost (HttpServletRequest peticion ,HttpServletResponse respuesta) throws IOException{
        //procesar los parametros
        //leer los parametros del fromulario html
        String usuario = peticion.getParameter("usuario");
        String password = peticion.getParameter("password");
        
        System.out.println("usuario = " + usuario);
        
        System.out.println("password = " + password);
        
        PrintWriter out = respuesta.getWriter();
        
        out.print("<html> ");
        out.print("<body> ");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br/> ");
        out.print("El parametro password es:" + password);
        out.print("</body> ");
        out.print("</html> ");
        out.close();
        
    };
}
