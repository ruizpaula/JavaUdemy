
package domain;

public class Rectangulo extends FiguraGeometrica {
    
    
    public Rectangulo (String tipoFigura){// se recibe el tipo figura
        super(tipoFigura);//el atributo de la clase padre
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: "+ this.getClass().getSimpleName()); //me trae el tipo de clase y el nombre simple
    }
}
