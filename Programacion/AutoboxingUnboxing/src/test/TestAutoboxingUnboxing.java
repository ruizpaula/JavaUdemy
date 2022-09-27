
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clase envolvernte de tipos primitivos
        /*
       -----------------------------------------
        tipoprimitivo      -  clase emvolvente 
       -----------------------------------------
        int - Integer 
        Long -long
        float - Float
        double - Double 
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        /*Autoboxing = la literal primitiva de tipo entero  se convierte 
        a un tipo objet 
        
        */
        //    Tipo Object <--------- tipo primitivo  
         Integer entero = 10;
         System.out.println("entero = " + entero);
         System.out.println("entero = " + entero.doubleValue());
         
         
         int entero2 = entero; // se extraeu el valor primitivo para asignarlo a una variable ,  se conoce como Unboxing
         //  la variable de tipo entero tiene el valor de 10
         System.out.println("entero2 = " + entero2);
    }
}
