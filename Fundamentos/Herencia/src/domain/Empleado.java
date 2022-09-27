
package domain;

//la clase EMPLEADO debe de extender de la clase PERSONA
public class Empleado extends Persona {
    private int idEmpleado; // la variable contadorEmpleado se va a usar para asignarle un valor unico al
    //atributo idEmpleado
    private double sueldo;
    private static int contadorEmpleado; //incrementar en 1 cada vez que se cree un empleado
    
    public Empleado(){
        //super(); ----> hace una llamada  la clase padre de persona automaticamente
        this.idEmpleado = ++Empleado.contadorEmpleado;// inicialiado el idempleado
    }

    public Empleado( String nombre, double sueldo) {
        //como llamar al constructor de la clase padre...???!!!
        //super(nombre);// recibir el argumento nombre de la clase empleado 
        //se crea un objeto de la clase empleado
        //el argumento se propaga a la clase padre 
        this();// ------------> llama al constructor vacio
        this.nombre = nombre; 
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", Persona = {").append(super.toString()).append ("}");
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
