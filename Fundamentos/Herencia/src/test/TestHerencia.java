
package test;

import domain.Empleado;
import domain.Cliente;
import domain.Persona;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0 );
        System.out.println("Empleado 1  = " + empleado1);
        
//        Cliente cliente1 = new Cliente (new Date(), true, "Paula",'F', 19, "carrera 30" );
//        System.out.println("cliente1 = " + cliente1);
        
//        Persona person1 = new Persona();
    }
}
