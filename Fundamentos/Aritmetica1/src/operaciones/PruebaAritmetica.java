package operaciones;
public class PruebaAritmetica {
    //metodo main
    public static void main(String[] args) {
        // variables locales 
        var a = 10; //como estan en diferentes lineas se puede usar la variable var
        var b = 2;
        miMetodo();
        Aritmetica1 arit1 = new Aritmetica1();
        System.out.println(" aritmetica1 a= " +arit1.a );
        System.out.println(" aritmetica1 b= " +arit1.b );
     
        Aritmetica1 arit2 = new Aritmetica1(5, 8);
        System.out.println(" aritmetica2 a= " +arit2.a );
        System.out.println(" aritmetica2 b= " +arit2.b );
        
        //arit1 = null;
        //System.gb();
    }
    
    public static void miMetodo(){
        //La variable esta fuera del alcance donde fue definida
        //a = 10;
        System.out.println("Otro metodooo");
    }
}
