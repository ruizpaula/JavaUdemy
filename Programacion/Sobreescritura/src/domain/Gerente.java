
package domain;

//CLASE HIJA
public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento ){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //sobreescritura del metodo 
    @Override // indica que esta siendo sobreescrito desde la clase padre
    public String ObtenerDetalles(){
        //atributo extra
        return super.ObtenerDetalles() + ", departamento: " + this.departamento;
        //retorna ,,, super llama al constructor donde toene los  2 arg ,,, despues se inicializa el atributo que hace falta
        //agrega nuevo codigo 
        
    }
    
}
