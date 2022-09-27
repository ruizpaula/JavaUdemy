package com.gm.mundopc;


public class Raton extends DispositivoEntrada {
    private int idRaton ;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);// super para llaamr el construyctor de la clase padre y acceder a sus atributos
        this.idRaton = ++Raton.contadorRatones;  //primero se pre incrementa y luego se le asigna un valor 
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", "+ super.toString() + '}';// incluira los atributos de tipo de entrada
          //                                                                   y marca
    }
    
    
    
    
}
