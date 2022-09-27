
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
       int edades[][] = new int [3][2];    //3 renglones * 4 columnas 
        System.out.println("edades = " + edades);
       
        edades [0][0] = 5;
        edades [0][1] = 7;
        edades [1][0] = 5;
        edades [1][1] = 4;
        
        System.out.println("edades 0-0  = " + edades[0][0]);
        System.out.println("edades 0-0  = " + edades[0][1]);
        System.out.println("edades 0-0  = " + edades[1][0]);
        System.out.println("edades 0-0  = " + edades[1][1]);
        
        for (int renglon = 0; renglon < edades.length ; renglon++) {
            // .LENGTH ES EL LARGO o (cantidad de renglones)  DEl ARREGLO DE LOS RENGLONES
            for (int columna = 0; columna < edades[renglon].length ; columna++) { 
            // contador de renglon para que nos regrese el lago de las columnas que tiene el renglon 
            //que se esta trabajando e este momento 
                System.out.println("imprimir matriz edades " + renglon + " - " + columna + " : "+ edades[renglon][columna]);
            }
        }
        
        //String frutas[][] = new String[3][2]; instanciar un objeto 
        String frutas[][]= {{"Naranja", "Limon"},{"Fresa", "Maracuya", "Mora"}};
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        imprimir(personas);// le pasamos  la matriz personas de tipo object 
                
        
    }// end main
    
    public static void imprimir(Object matriz[][]){
    for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("imprimir arreglo de MATRIZ tipo objetc : "+ ren + " - "+ col + " : "+ matriz[ren][col]);
            }
        }
    }
    
}
