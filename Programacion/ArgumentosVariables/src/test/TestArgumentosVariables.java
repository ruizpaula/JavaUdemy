
package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);  // una cantidad de elementos indefinidos 
        variosParametros("Juan", 8,4,7,12 , 6);
    }
    
    private static void variosParametros(String nombre, int ... numeros){//el arg variable debede estar al FINAL
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros); //PARA RECORRE LOS NUMEROS
    }
    
    
    private static void imprimirNumeros(int... numeros){//tipo + 3 puntos significa que se van a usar arg variables 
        // numeros pasa a ser un arreglo
        for (int i = 0; i < numeros.length; i++) {// propiedad length
            System.out.println("elementos i = " + numeros[i]);
        }
    }
}
