package mx.com.gm.peliculas.negocio;

import java.util.List;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl(); //la clase que implemeta la interface
        //acceder a los metodos definidos en la interface AccesoDatosImpl
        //this.datos
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        //convertir String a Pelicula
        //Objet Pelicula
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            //se manda a escribir
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (Pelicula pelicula : peliculas) {//imprime las peliculas que estan en el archivo
                System.out.println("pelicula = " + pelicula );
            }
           
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void buscarPelicula( String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
            
        } catch (LecturaDatosEx ex) {
            ex.printStackTrace(System.out);
        }
        
        System.out.println("resultado de busqueda   = " + resultado );

    }

    @Override
    public void iniciarArchivo() {
        try {
            //si existe y se quiere Iniciar Catalo de Peliculas entonces se borra y se crea
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al Iniciar Catalo de Peliculas");
            ex.printStackTrace(System.out);
        }
    }

}
