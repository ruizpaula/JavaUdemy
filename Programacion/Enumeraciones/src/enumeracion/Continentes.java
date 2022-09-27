
package enumeracion;

public enum Continentes {
    AFRICA(53),// elemento (argumento)
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14); // ultimo valor
    private final int paises; // final porque asignado un valor no queremos que se modifique 
    
    Continentes(int paises){ // numero de paises 
            this.paises = paises; // el atributo esta encapsulado
            
    }
    
    // para recuperar el valor 
    public int getPaises(){
        return this.paises;
    
    }
}
