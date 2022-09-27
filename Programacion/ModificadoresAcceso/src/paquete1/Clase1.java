
package paquete1;


      class Clase1 {
    //public String atributoPublico = " impriendo texto de un Valor atributo publico";
    //protected String atributoProtected = " impriendo texto de un Valor atributo protected";
    private String atributoPrivado = " impriendo texto de un Valor atributo default";
    
     private Clase1(){
        System.out.println("constructor private ");
    }
     
     
    public Clase1 (String argumento){
        this();
        System.out.println("Constructor publico");}
    
    private void metodoPrivate(){
        System.out.println("Metodo private");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }


    
    
    
}


