package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")// path del componente con el que va a responder en el navegador
public class Servlet extends HttpServlet {

    @Override //porque se esta sobrescribiendo un metodo
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("usuario"); //solicitar parametro
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");//regresar varios valores
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet : </h1>");

        out.print("<table border = ´1´>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Uusario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologias");
        out.print("</td>");
        out.print("<td>");
        for (String ltstecnologia : tecnologias) {
            out.print(ltstecnologia);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Genero");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupacion");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
        out.print("</tr>");

        //puede enviar erro ya que el usuaria no a proporcionado un valor
            out.print("<tr>");
            out.print("<td>");
            out.print("Musica");
            out.print("</td>");
            out.print("<td>");
        if (musica != null) {
            
            for (String ltstMusica : musica) {
                out.print(ltstMusica);
                out.print(" / ");
            }
            
        }else{
            out.print("Error, no se ha seleccionado musica ");
        }
            out.print("</td>");
            out.print("</tr>");
        
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Comentarios");
        out.print("</td>");
        out.print("<td>");
        out.print(comentarios);
        out.print("</td>");
        out.print("</tr>");
        

        out.print("</table>");

        out.print("</body>");
        out.print("</html>");

    }
}
