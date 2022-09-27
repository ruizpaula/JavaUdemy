
package domain;


public class Escritor  extends Empleado{
    
    final TipoEscritura tipoEscritura; //se utilizza la enumeracion tipo escritura
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){ // recibir en estas variables
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override // indicar al compilador sobrescribiendo el metodo de la clase padre
    public String ObtenerDetalles(){
        return super.ObtenerDetalles()+ ", tipo de escritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}'+ " " + super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    
    
    
}
