
package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
      int x = 10;
        System.out.println("x = " + x);
        
        cambioValor(x);
        
        System.out.println("x el nuevo valor = " + x );
    }
    public static void cambioValor(int arg1){  // argumento de tipo primitivo
        System.out.println("arg1 = " + arg1);      
        arg1 = 15;
        
    }
}
