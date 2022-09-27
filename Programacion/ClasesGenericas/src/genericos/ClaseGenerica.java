
package genericos;


public class ClaseGenerica<T> { // recibe un atributo de tipo generico
    //<T> tipo generico
    private T objeto; //no se sabe de que tipo o clase es 
    
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
        //se va imprimir el tipo que al fin se utilizo
    }
}
