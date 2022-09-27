
package operaciones;

public class Caja {
   //atributos 
   int ancho;
   int alto;
   int profundo;
   
   
   //constructores
   
   public  Caja(){
       
       System.out.println("Ejecutar constructor vacio");
   
   }
   public Caja(int ancho, int alto, int profundo){
      this.ancho = ancho;
      this.alto = alto;
      this.profundo = profundo;
      
      System.out.println("Ejecutando constructor con arg " );
      
      
   }
      //metodo calcular volumen
   
   public int calcularVolumen(){
       return ancho *alto *profundo ;
   }
   
   
   
}
