package web;

//agregar notacion del webServlet
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //cabeceros relacionados con relacion a la peticion
        String metodoHttp = request.getMethod(); //solicitar el tipo de metodo http que se esta ejecutando en esa peticion
        out.print("<html>");
        out.print("<head>");
        out.print("<title> Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1> Headers HTTP</h1>");
        out.print("Metodo Http : " + metodoHttp);

        String uri = request.getRequestURI();
        out.print("<br>");
        

        out.print("Uri solicitada: " + uri);

        //Imprimir todos los cabeceros disponibles en esta peticion http
        out.print("<br>");
        out.print("<br>");
        Enumeration cabeceros = request.getHeaderNames();
        while (cabeceros.hasMoreElements()) {//para iterar cada uno de los elementos
            //hasMoreElements = para saber si tenemos mas elementos para iterar
            String nombreCabecero = (String) cabeceros.nextElement(); // nextElement solicitar el siguiente elemento
            //hacer un cas convertir de object a string
            out.print("<b>" + nombreCabecero + "</b>:");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");

        }

        out.print("</body>");
        out.print("</html>");
        out.close(); //cerrar el objeto printWriter

    }
}
