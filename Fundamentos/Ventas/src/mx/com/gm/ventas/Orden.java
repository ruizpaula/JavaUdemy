
package mx.com.gm.ventas;

public class Orden {
    private  int idOrden ;
    private Producto productos[]; // solo se esta declarando 
    private static int contadorOrdenes;
    private int contadorProductos; // cuantos objetos de tipo producto se han agregado a este objeto Orden 
    private static final int MAX_PRODUCTOS = 10;//constante
    
    
    public Orden(){
       this.idOrden = ++Orden.contadorOrdenes; //preincremento
       //valor unico por cada objeto que se cree 
       this.productos = new Producto[Orden.MAX_PRODUCTOS];// para acceder al atributo MAX... se indica el nombre de la clase 
       //             tipo  producto       se indica la cantidad de leementos que se van a tener 
    }
    
    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++ ] = producto;// inidcar en que posicion va estar el producto// POSINCREMENTO
        }
        else{
            System.out.println("Se ha superado el maximo de productos : "+ Orden.MAX_PRODUCTOS);  
        }
    }
    
    
    public double calcularTotal(){
        double total = 0; //variable local
        for (int i = 0; i < this.contadorProductos  ; i++) {
            //Producto producto = this.productos[i]; 
            //variable local producto
            
            //total += producto.getPrecio();
            total += this.productos[i].getPrecio();  // total = total + producto.getPrecio()
            // operador de asignación compuesta =  se utiliza para sumarle una valor a cierta variable.
        }
        return total;
        
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden "+ this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden $"+ totalOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
}
