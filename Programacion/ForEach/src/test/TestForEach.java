
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] ={5,6,8,9};
//        for (int i = 0; i < edades.length ; i++) {
//            
//        }

        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        //no se puede imprimir el indice 
    }
    
    
    Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
    for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    
    
}
    
    

