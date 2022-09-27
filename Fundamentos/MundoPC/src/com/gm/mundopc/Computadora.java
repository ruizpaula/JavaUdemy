
package com.gm.mundopc;


public class Computadora {
    private final int  idComputadora;
    private String nombre;
    //_______________________________________________________
    private Monitor monitor;// RELACION de agregacion de clase
    private Teclado teclado;// RELACION de agregacion de clase
    private Raton raton;// RELACION de agregacion de clase
    //_______________________________________________________
    private static int contadorComputadores;
    
    
    
    
    
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadores;
            
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado , Raton raton ){
    this();
    this.nombre = nombre;
    this.monitor = monitor;
    this.teclado = teclado;
    this.raton = raton ;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
    
    
}
