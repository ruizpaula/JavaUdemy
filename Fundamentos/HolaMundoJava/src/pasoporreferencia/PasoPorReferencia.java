
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juannnnn";
        System.out.println("Nombre de la persona 1 : "+ persona1.nombre);
        
        persona1 =cambiarValor(persona1);
        
        // volvemos a imprimir la variable persona con el cambio de nombre 
        System.out.println("persona1  cambio su nombre"+ persona1.nombre );
    }
    
    //nuevo metodo
    
    
    public static Persona cambiarValor(Persona persona){ //clase + argumento
        persona.nombre = "Karla";
        return persona; // se regresa el objeto persona ya modificado
    }
    
}
