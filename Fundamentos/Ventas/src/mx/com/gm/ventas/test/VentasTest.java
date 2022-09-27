
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa ", 50.000);
        Producto producto2 = new Producto("Pantalon ", 100.000);
        Producto producto3 = new Producto ("Chaqueta", 150.000);
        Producto producto4 = new Producto("Camisa ", 50.000);
        Producto producto5 = new Producto("pantaloneta ", 100.000);
        Producto producto6 = new Producto ("medias", 150.000);
        Producto producto7 = new Producto("blusa ", 50.000);
        Producto producto8 = new Producto("jean ", 100.000);
        Producto producto9 = new Producto ("gorra", 150.000);
        Producto producto10 = new Producto("cinturon ", 50.000);
        Producto producto11 = new Producto("zapatos ", 50.000);

        
        //agregar esos productos a la clase orden 
        Orden orden1 = new Orden(); //inicializar la Orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        orden1.agregarProducto(producto11);
        
        orden1.mostrarOrden();
    }
}
