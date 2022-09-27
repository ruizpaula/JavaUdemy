
package com.gm.mundopc;

public class Monitor {
   private final int idMonitor ;
   private String marca;
   private double tamaño;
   private static int contadorMonitores;
   
   //constructor 
   private Monitor(){
    this.idMonitor = ++Monitor.contadorMonitores;
   }
   
   public Monitor(String marca, double tamaño){
       this();
       this.marca = marca;
       this.tamaño = tamaño;
       
   }

   public int getidMonitor() {   // solo GET para id del monitor
        return this.idMonitor;
    }
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
   
   
}
