
package test;

import dominio.Persona;


public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("Nombre persona1  = " + persona1.getNombre());
        System.out.println("persona1: "+ persona1.toString());
        persona1.setNombre("Juan Carlos Armando");
        // persona1.nombre = "Juan Carlos";  hacerlo de esa forma directa no deja, porque el atributo
        //tiene el modificador de privado
        //System.out.println("persona1 nombre = " + persona1.nombre);
//        System.out.println("Nombre persona1 objeto modificado = " + persona1.getNombre());
//        System.out.println("Persona1 sueldo = "+ persona1.getSueldo());
//        System.out.println("persona1 eliminado" +persona1.isEliminado());
//        // se utiliza el metodo isEliminado porque se pregunta si es true o false
//        
//        Persona persona2 = new Persona("Camila", 1000000.00, false);
//        System.out.println("Nombre persona2  = "+ persona2.getNombre());
//        System.out.println("Sueldo persona2 = "+ persona2.getSueldo());
//        System.out.println("Eliminado persona2 = "+ persona2.isEliminado());
//        
//        persona2.setNombre("Maria Fernanda");
//        persona2.setSueldo(2000.00);
//        persona2.setEliminado(true);
//        
//        System.out.println("nombre persona2 modificado = "+ persona2.getNombre());
//        System.out.println("sueldo persona2 modificado = "+ persona2.getSueldo());
//        System.out.println("eliminado persona2 modificado = "+ persona2.isEliminado());

          System.out.println("persona1: "+ persona1.toString());
    }
}
