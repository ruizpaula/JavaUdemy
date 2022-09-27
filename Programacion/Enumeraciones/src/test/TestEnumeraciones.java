
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
       // System.out.println("Dias 1  : " + Dias.LUNES );  // se puede accedder a los valores de la clase dias por ser constantes 
       // indicarDiaSemana(Dias.MARTES);  //CASO LUNES
       
        System.out.println("Contienente No.4 :" + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to continenete : " 
                  + Continentes.AMERICA.getPaises());
        
        System.out.println("Contienente No.1 :" + Continentes.AFRICA);
        System.out.println("No. Paises en el 1er  continenete : " 
                  + Continentes.AFRICA.getPaises());
    }
    
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana ");
                break; // break para romper este caso
            case MARTES:
                System.out.println("Segundo dia de la semana ");
                break;
            default:
                System.out.println("Dia desconocido , vuelve a intentarlo");
        }
    }
}
