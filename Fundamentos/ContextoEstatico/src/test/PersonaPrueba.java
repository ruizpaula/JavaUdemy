
package test;

import domain.Persona;

public class PersonaPrueba {
    
    private int contador;
    
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Paula");
        Persona persona2 = new Persona("Karla");
        
        //llamar el metodo imprimir
        imprimir(persona1);
        imprimir(persona2);
        
        //this.contador = 10; genera error porque la variable es estatica 
        
    }
    
    public static void imprimir(Persona persona){//metodo ... clase nombre de la variable obj
        System.out.println("Persona = " +persona);//se imprime la variable obj
    }
    
    //metodo no estatico
    public int getContador(){
        imprimir(new Persona("Carlitosssssssssssss"));// nuevo obj tipo persona 
        return this.contador;
    }
}
