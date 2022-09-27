package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int [3];
        // se crea una varia y = se instancia un objeto de tipo arreglo
        System.out.println("edades = " + edades);
        
        //acceder a los elementos del arreglo
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
//        edades[1] = 5;
//        System.out.println("edades 1 = " + edades[1]);
//        edades[2] = 8;
//        System.out.println("edades 2 = " + edades[2]);
//        
        //edades [3] = 5;
        //error en tiempo de ejecucion , no se puede exceder a los indices definidos en el arreglo
        
        for(int i = 0; i < edades.length ; i++){
            System.out.println("edades elemento " + i + ": "+ edades[i]);
            
            // imprimir i para que nos diga a cual elemento esta accediendo        y despues el valor 
        
        }
    }
 
}
