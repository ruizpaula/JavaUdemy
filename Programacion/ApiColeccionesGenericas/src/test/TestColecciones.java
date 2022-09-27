package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {

        //          ---------          LIST        -----------
        List miLista = new ArrayList();//GUARDA EÑ ORDEN conforme a como se guardaron los elementos 
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");

//        imprimir(miLista); //se pueden duplicar los elementos
        //iterar una lista
        //imprimir los elementos
//        for(Object elemento : miLista){//elemetos tipo object
//            System.out.println("elemento = " + elemento);
//        }
//        miLista.forEach(elemento -> {
//            //elemetos tipo object
//            System.out.println("elemento = " + elemento);
//        });
        //           ----------         SET       ----------
        Set miSet = new HashSet();// NO GUARDAS EL ORDEN

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

//        imprimir(miSet); //no se puede duplicar porque no lo cuenta
        //          ---------          MAP        -----------
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");

        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection coleccion) {
//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
