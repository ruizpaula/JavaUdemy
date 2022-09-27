
package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica();
        //no se puede crear objetos con la clase abstracta sino con clases hijas 
        //nose puede trabajar con clases padres 
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        // tipo hijo a tipo padre no necesita conversion 
        
        figura.dibujar();
        
    }
}
