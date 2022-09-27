package domain;


public  final class Persona {
    public final static int MI_CONSTANTE = 1; // se combina con la palabra static ,,, para que se pueda llamar est varible
            // solamente usndo el nombre de la clase sin necesidad de crear una instancia , debido a que es fianl no se puede 
            //modificar su valor 
            //constante 
      
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    public final void imprimir(){
        System.out.println(" holaaaaa metodo imprimir " );
    }
}
