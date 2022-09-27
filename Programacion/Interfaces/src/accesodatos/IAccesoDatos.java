
package accesodatos;


public interface IAccesoDatos {
    
    // si se define = constante 
    //no tiene constructores
    //solo metodos  abstractos
    
    int MAX_REGISTROS = 10;
    
    //es abstracto , no tiene CUERPO y no se agregar --> {}
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
 