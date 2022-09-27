
package operaciones;

public class Aritmetica1 {
    //atributos
   int a;
   int b; 
   
   
   //CONSTRUCTOR vacio
   public Aritmetica1(){
       System.out.println("Ejecutando constructor");
       
   }
   public Aritmetica1(int a, int b){
       this.a = a;
       this.b = b;
       
       System.out.println("Ejecutando constructor con arg " );

   }
   
   
   
   
   
   
   //metodos
   public void sumar(){
       int resultado = a + b ;
       System.out.println("resultado = " + resultado);
   }
   public int sumarConRetorno(){
    //   int resultado = a + b;
    //   return resultado;
    return this.a + this.b;
   }
   public int sumarConArgumentos(int a, int b){
  // modificador de acceso + tipo de retorno + nombre del metodo  + (argumentos )  la informacion que va a recibir el metodo
       //variables locales
       this.a = a; // El argumento a se aigna al atributo this.a
       this.b = b; // 
       //return a + b;
       
       //reutilizar metodo
       return this.sumarConRetorno();
       
   }
}
