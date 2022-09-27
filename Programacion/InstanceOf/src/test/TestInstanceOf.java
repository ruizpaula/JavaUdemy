
package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 6000);
//        determinarTipo(empleado1);
        
        empleado1 = new Gerente ("Karla" , 1000, "Contabilidad ");
        determinarTipo(empleado1);
    }
 
    
    public static void determinarTipo(Empleado empleado ){// tipo d ela clase padre
        if(empleado instanceof Gerente){/* si la variable empleado esta apuntando a un 
            Objeto en menoria de tipo gerente */
            System.out.println("Es de tipo generente ");// si es de cierto que estamos usando el mismo tipo o mas generico 
            
            
            // cambiar la variable tipo padrea una variable tipo hijo
            //crear una variable local para convertila a una variable ---> tipo hijo (gerente )
//            Gerente gerente =(Gerente)empleado;
//            gerente.getDepartamento();
//            System.out.println("gerente = " + gerente.getDepartamento());//accedermos a los metodos de la clase hija
//            
        }
        else if (empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object ");
        }
    }
}
