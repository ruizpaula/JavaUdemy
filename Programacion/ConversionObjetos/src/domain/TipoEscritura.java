
package domain;

public enum TipoEscritura { // dos clase de escrituras  ,dos enumeraciones
    TIPO_CLASICO ("Ecritura a mano"); // enumeracion(atributo)
    //TIPO_MODERNO ("Escritura Digital");
    
    private final String descripcion;// una vez que se asigne el valor no sera necesario modificarlo
    
    private TipoEscritura(String descripcion ){
       this.descripcion = descripcion  ;
    }

    public String getDescripcion() {//para recuperar la descripcion
        return descripcion;
    }
    
    
}
