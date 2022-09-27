
package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 6000);
        System.out.println("empleado1 = " + empleado1.ObtenerDetalles());
        imprimir(empleado1);
        
        Gerente gerente1 = new Gerente ("Karla" , 1000, "Contabilidad ");
        System.out.println("gerente1 = " + gerente1.ObtenerDetalles());
        imprimir(empleado1);
    }
 
    
    public static void imprimir(Empleado empleadoVar ){// tipo d ela clase padre
        String detalles = empleadoVar.ObtenerDetalles();
        System.out.println("metodo desde   imprimir empleado   = " + empleadoVar.ObtenerDetalles());
    }
}
