
package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        
        
        Empleado empleado1 = new Empleado("juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("Tiene la misma referencia de memoria" );
        }
        else{
            System.out.println("Tienen distinta referencia de memoria = " + empleado1 + " y " + empleado2 );
        }
        
        
        if(empleado1.equals(empleado2)) {;//compara las referencia y los contenidos
        
            System.out.println("Los objetos son iguales en contenido");
        }else{
            System.out.println("Los objetos son distintos en contenidos");
        }
        
        
        
        
        if(empleado1.hashCode() == empleado2.hashCode()){// si el valor de hascode = variable entre empleado1 y empleado2
            System.out.println("el valor hascode es igual" + empleado1.hashCode()+ " y " + empleado2.hashCode());
        }else{
            System.out.println("el valor hascode es diferente "+ empleado1.hashCode()+ " y " + empleado2.hashCode());
        }
    }
}
