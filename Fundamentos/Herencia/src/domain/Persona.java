package domain;

public class Persona {
    
    
  protected String nombre;// los atributos en privado no se heredan
  // si las clases hijas accedan a esos atributos hay qie colocar en el modificador 
  // protected String nombre; PROTECTED para acceder a los atributos directamente 
  protected char genero;
  protected int edad;
  protected String direccion;
  
  
  //contructor vacio
  //es para crear objetos de tipo persona sin necesidad de inicializar los atributos de esta clase
  public Persona(){
  
  }
  //constructor con un argumento para inicializar 
  public Persona(String nombre){
   this.nombre = nombre;
   
  }

  
  //constructor con varios argumentos
  
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    
    //metodos get y set 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
  //metodo toString
//imprime el estado del obj

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append('}').append(super.toString());
        return sb.toString();
    }
   
    
  
  
}
