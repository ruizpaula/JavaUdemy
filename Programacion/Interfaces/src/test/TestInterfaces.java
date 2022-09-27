
package test;

import accesodatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        //crear variablestipo interfaces 
        IAccesoDatos datos = new implementacionMySql(); 
        //crear objetos de  las clases que implementan el comportamento de las interfaces
        //datos.listar();// se ejecuta el metodo listar de la implementacionMySql
        
        //imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
       
        
    }
    
    
    public static void imprimir(IAccesoDatos datos){
            datos.listar(); // imprime Listar desde MySql porque esta apuntado a la clase implementacionMySql
        }
}
