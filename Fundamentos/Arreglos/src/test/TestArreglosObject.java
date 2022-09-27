
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
    Persona personas[] = new Persona[2]; 
    
    // modificar las variables tipo arreglo
    personas[0] = new Persona("Juna");
    personas[1] = new Persona("Karla");
    
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1  = " + personas[1]);

        
        for (int i = 0 ; i < personas.length; i ++){
            System.out.println("clico for personas = " + i + " = "+ personas[i]);
        
        }
      // definir un arreglo en los que se pueda inicializar los elementos desde un principio
       
      String frutas[] = {"Naranja", "Fresa", " Uva", " Manzana"};
        for (int i = 0; i < frutas.length ; i++) {
            System.out.println("frutas = "+ i + " = " + frutas[i]);
        }
    }
}
