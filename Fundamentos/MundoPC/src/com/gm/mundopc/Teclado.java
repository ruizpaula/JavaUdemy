
package com.gm.mundopc;
 
public class Teclado extends DispositivoEntrada {
    private int idTeclado ;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);// super para llaamr el construyctor de la clase padre
        this.idTeclado = ++Teclado.contadorTeclados;  //primero se pre incrementa y luego se le asigna un valor 
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado +  ", "+ super.toString() + '}';// incluira los atributos de tipo de entrada
          //                                                                                            y marca
    }
}
