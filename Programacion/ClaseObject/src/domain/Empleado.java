package domain;

import java.util.Objects;


//CLASE PADRE
public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String ObtenerDetalles(){
       return "Nombre :" + this.nombre + ", sueldo : " + this.sueldo; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nombre);
       // conseguir un valor entero unico para ese objeto unico
       // con los valores de los atributos de este objeto
        
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {// compara el contenido de 2 objetos
        if (this == obj) {//this es un obj que no es null
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {// si el contenido de la palabra nombre = al otro obj se continua
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
