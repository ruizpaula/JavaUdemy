
package com.gm.mundopc;

public class Orden {
   private final int idOrden;
   private Computadora computadoras[];
   private static int contadorOrdenes;
   private int contadorComputadoras; // para saber cuantas computadoras se agregan al arreglo
   private static final int MAX_COMPUTADORAS = 10;
   
   public Orden(){
       this.idOrden = ++Orden.contadorOrdenes;
       this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
   }
   
   public void agregarComputador(Computadora computadora){
       if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
           this.computadoras[this.contadorComputadoras++] = computadora;//esto es un arreglo ----
           //cada vez quese agregue una computadora se va incrementando
       }else{
           System.out.println("Se ha superado el maximo de compuadoras " + Orden.MAX_COMPUTADORAS);
       }
   }
   
   
   public void mostrarOrden(){
       System.out.println("idOrden = " + this.idOrden);
       System.out.println("Computadoras de la orden :");
       for (int i = 0; i < this.contadorComputadoras; i++) {
           System.out.println(computadoras[i]); // imprime el metodo toString
       }
   }
   
}
