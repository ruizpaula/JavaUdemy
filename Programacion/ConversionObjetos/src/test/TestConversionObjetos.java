
package test;

import domain.*;


public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado; //declarar la variable
        
        //empleado = new  Empleado ("Juan", 5000);
        // una variable empleado apuntando a un objeto tipo escritor
        empleado = new  Escritor ("Juan", 5000, TipoEscritura.TIPO_CLASICO);
//        System.out.println("empleado = " + empleado);
        
        
        //System.out.println(empleado.ObtenerDetalles());
        
        //empleado.getTipoEscritura(); no se puede acceder a ese metodo get de la clase hija (escritor)
        
        
        //              CONVERSION DE OBJETOS
        
        
        //  de objeto EMPLEADO a objeto hija ESCRITOR
        // de padre a hijo
        // ---------------- Downcasting --------------
        //indicar la clase a la cual se quiere convertir
        //((Escritor)empleado).getTipoEscritura(); // de padre a hijocon el punto se accede al metodo getTipoEscritura()
        
        
        // --------------- Upcasting ----------------
        Escritor escritor = (Escritor) empleado; // cambia una variable a un tipo escritor
        escritor.getTipoEscritura();
       
        
        
        
        // de escritor(hijo) a empleado(padre)
        
        
        
        Empleado empleado2 = (Empleado)escritor;  // de hija a padrea 
        //empleado2.ObtenerDetalles();
        
        //empleado.getTipoEscritura(); no se puede acceder a ese metodo get de la clase hija (escritor)
        
        System.out.println(empleado2.ObtenerDetalles());
        
    }

   
    
    
}
 