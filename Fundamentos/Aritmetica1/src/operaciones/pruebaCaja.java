package operaciones;

public class pruebaCaja {
    
    public static void main(String[] args){
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        Caja objeto1 = new Caja();// instanciar
        objeto1.ancho = ancho;
        objeto1.alto = alto;
        objeto1.profundo = profundo;
        int resultado = objeto1.calcularVolumen();

        System.out.println("resultado volumen de caja 1:" + resultado);
        
        Caja objeto2 = new Caja( 4 , 5 , 2);
        System.out.println(" El resultado del objeto 2 es  = " + objeto2.calcularVolumen());
        

        

    }

}
