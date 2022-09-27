
package mx.com.gm.ventas;


public class Producto {
    private final int idProducto;// cuando se asigne un valor a la variable ya no se podra modificar 
    private String nombre;
    private double precio;
    private static int contadorProductos; // es estatico ....
    
    
    //conctructor privado vacio
    private Producto(){
       this.idProducto = ++Producto.contadorProductos;  //inicializar .... nombre de la clase para acceder al metodo
       //por cada objeto que se cree se va a tener un nuevo identificador 
       //ese nuevo identificador se asigna a la variable idProducto
       
    }
    
    //constructor publico lleno
    
    public Producto(String nombre, double precio){
     this();//llamando al constructor privado vacio
     this.nombre = nombre;
     this.precio = precio ;
     
     
     
     // metodos getter y setter 
     
    
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    //metodo to string 

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
