package dominio;

public class Persona {
    //String nombre; el modificador esta en default package
    // puede acceder a ese atributo otras clases mientras esten el mismo paquete 
   private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    
    
    //constructor ,,, no regresa ningun tipo de dato
    public Persona(String nombre, double sueldo , boolean eliminado){//argumentos ,,, son variables locales
        this.nombre = nombre; // inicializamos cada atributo de la clase 
        //this.atributo de la clase = nombre del argumento
        this.sueldo = sueldo;
        this.eliminado = eliminado; 
    }
    //get para recuperar la inf
    public String getNombre(){// recuperar el atributo nombre
        return this.nombre;
    }
    //set para modificar el atributo
    public void setNombre(String nombre){
       this.nombre = nombre;
       
    }
    
    public double getSueldo(){
        return this.sueldo ;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){
        return this.eliminado;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado ;
    }
    
    public String toString(){// convierte a cadena cada uno de los atributos que tenemos en la clase
      return "Persona  [nombre : "+ this.nombre +
              ", sueldo : "+ this.sueldo + 
              " , eliminado : "+ this.eliminado + " ]"; 
    }
    
}
