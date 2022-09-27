package mx.com.gm.peliculas.negocio;

public interface ICatalogoPeliculas {

    //agregar una constante
    
    String NOMBRE_RECURSO = "Pelicula.txt";//nom archivo
            
    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();

    void buscarPelicula( String buscar);

    void iniciarArchivo();
}
