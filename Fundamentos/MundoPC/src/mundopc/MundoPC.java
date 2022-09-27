
package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HP", 13);
        Teclado teclado1 = new Teclado("Bluetooh","HP");
        Raton raton1 = new Raton("Bluetooh","HP");
        Computadora computadora1 = new Computadora( "Computadora HP", monitor1, teclado1, raton1 );// se agregar los objetos 
        
        Monitor monitor2 = new Monitor("Gamer", 34);
        Teclado teclado2 = new Teclado("Bluetooh","Gamer");
        Raton raton2 = new Raton("Bluetooh","HP");
        Computadora computadora2 = new Computadora( "Computadora Gamer", monitor2, teclado1, raton2 );
        
        
        //objeto de tipo orden
        Orden orden1 = new Orden();//inicializar
        orden1.agregarComputador(computadora1);
        orden1.agregarComputador(computadora2);
        
        orden1.mostrarOrden();

    }
}
