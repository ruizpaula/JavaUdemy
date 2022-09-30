package web;

import datos.ProductosDaoJDBC;
import dominio.Producto;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarProducto(request, response);
                    break;
                case "editar":
                    this.editarProducto(request, response);
                    break;
                case "eliminar":
                    this.eliminarProducto(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Producto> producto = new ProductosDaoJDBC().listar();
        System.out.println("producto = " + producto);
        request.setAttribute("producto", producto);//compartir la lista
        request.getRequestDispatcher("listadeproductos.jsp").forward(request, response);
    }


    private void recuperarDatosProducto (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos el idCliente
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        Producto producto = new ProductosDaoJDBC().encontrar(new Producto(codigo));
        request.setAttribute("producto", producto);
        String jspEditar = "/WEB-INF/paginas/producto/editarProducto.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarProducto(request, response);
                    break;
                case "modificar":
                    this.recuperarDatosProducto(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void insertarProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos los valores del formulario agregarProducto
        String nombre = request.getParameter("nombre");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int inventario = Integer.parseInt(request.getParameter("inventario"));

        //Creamos el objeto de cliente (modelo)
        Producto producto = new Producto(nombre, precio, inventario);

        //Insertamos el nuevo objeto en la base de datos
        int registrosModificados = new ProductosDaoJDBC().insertar(producto);
        System.out.println("RegistrosModificados = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }

    private void editarProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos los valores del formulario editarCliente
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nombre = request.getParameter("nombre");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int inventario = Integer.parseInt(request.getParameter("inventario"));
        

        //Creamos el objeto de cliente (modelo)
         Producto producto = new Producto(codigo,nombre, precio, inventario);

        //Modificar el  objeto en la base de datos
        int registrosModificados = new ProductosDaoJDBC().actualizar(producto);
        System.out.println("registros recuperados  = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }
    
        private void eliminarProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos los valores del formulario editarCliente
        int codigo = Integer.parseInt(request.getParameter("codigo"));
     

        //Creamos el objeto de cliente (modelo)
         Producto producto = new Producto(codigo);

        //Eliminamos el  objeto en la base de datos
        int registrosModificados = new ProductosDaoJDBC().eliminar(producto);
        System.out.println("registro eliminado = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }

}
