
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
       Persona persona  = new Persona( new String ("Juan"), "Perez");
        System.out.println("persona = " + persona);// imprimir el objeto
        System.out.println("persona nombre = " + persona.nombre);
        System.out.println("persona apellido = " + persona.apellido);

    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
       this.nombre = nombre; // inicializar
       this. apellido = apellido; // plantilla
        System.out.println("Objeto persona usando this: " + this);// como imprimir el objeto actual??? ---->rta THIS
    }

}
