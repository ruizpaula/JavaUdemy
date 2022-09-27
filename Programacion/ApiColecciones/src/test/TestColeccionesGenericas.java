package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        //          ---------          LIST        -----------
        List<String> miLista = new ArrayList<>();//GUARDA EL ORDEN conforme a como se guardaron los elementos 
        // ya no es tipo object porque se le indica el tipo de dato
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);

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
        
        
        Set<String> miSet = new HashSet<>();// NO GUARDAS EL ORDEN

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        

//        imprimir(miSet); //no se puede duplica porque no lo cuenta
        //          ---------          MAP        -----------
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos");


        String elementoMapa = (String) miMapa.get("valor3");
        System.out.println("elementoMapa = " + elementoMapa);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {
        //solo trabaje con coleccion de tipo string 
        for(String elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
//        coleccion.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
    }

}
