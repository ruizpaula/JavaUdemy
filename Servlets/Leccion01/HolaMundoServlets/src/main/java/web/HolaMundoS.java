
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")//agregar el path para acceder al servlet
public class HolaMundoS extends HttpServlet {
    
    //definir metodo , ya esta definido en la clase padre,,,... sobreescritura
    @Override
    protected void doGet  (HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException{
        respuesta.setContentType("text/html;charset=UTF-8");//tipo de contenido+ juego de caracteres
        PrintWriter out = respuesta.getWriter();//imprmir al navegador web
        out.print("HOLA MUNDO DESDE SERVLESTS");
    }
}
