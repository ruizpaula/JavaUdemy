package domain;

public class Persona {

    //atributos
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    //constructor
    public Persona(String nombre){
     this.nombre = nombre;//inicializar con el argumento que tenemos
     // Incrementar elcontador por cada objeto
     Persona.contadorPersonas++; //nombre clase , no se puede llamar con el operador thsi porque el atributo es estatico
     //se incrementa 
     
     //asignar el nuevo valor a la variable idPersona
     this.idPersona = Persona.contadorPersonas;
    }
    
    //-------getter y setter 
    //get recuperar inf
    //set modficar  valor atributo 
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //--------------metodos estaticos--------------
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    
    
    // toString 
    @Override //anotacion 
    
    public String toString() {
        return "Persona{" + "idPersona = " + idPersona + ", nombre = " + nombre + '}';
    }
    
}
