
package clases;

public class PruebaPersona {
     public static void main(String[] args) {
         
         // persona unooo
        Persona per1 = new Persona();
        per1.nombre = "Juaneeettoo";
        per1.apellido ="Perezzz";
        //metodo
        per1.desplegarInformacion();
        
        
        // persona dosss
        Persona per2 = new Persona();
         System.out.println("per1 = " + per1);
         System.out.println("per2 = " + per2);
        //metodo
        per2.desplegarInformacion();
        per2.nombre = "Karlaaa";
        per2.apellido = "Lopez";
        per2.desplegarInformacion(); // nombre clase + metodo
    }
}
