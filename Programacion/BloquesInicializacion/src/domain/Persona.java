package domain;
public class Persona {
//    Hay bloque de codigo :
//    bloques de inicializacion estaticos 
//    bloques de inicializacion NO estaticos     
//    se ejecutan antes del constructor 
    
    private final int idPersona;
    private static int contadorPersonas;
    
    //    bloques de inicializacion estaticos 
    static{
        System.out.println("Ejecucion bloque estatico");
        //inicializar las variables
        // no se puede usar this
        ++Persona.contadorPersonas; //nombre de la clase 
        //idPersona = 10; no es estatica 
    
    }// solo se va a ejecutar UNA VEZ 
    
    
    
    //    bloques de inicializacion NO estaticos SOLO ABRIR  LLAVES {}
    {
        System.out.println("Ejecucion bloque NO estatico");
        //si tenemos al operador this
        this.idPersona = Persona.contadorPersonas++;// valor unico
    }// SE PUEDE EJECUTAR ACADA VEZ QUE SE LLAME 
    
    
    
    
    //constructor
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    
    
    public int getIdPersona() {
        return idPersona;
    }   

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
