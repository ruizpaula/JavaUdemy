
package aritmetica;

import exepciones.OperacionExcepcion;



public class Aritmetica {
    public static int division(int numerador, int denominador)
             {//posiblemente arroje la excepcion 
        if(denominador == 0){
            //throw ---> arrojar la expecion 
            //operacion expecion
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador/ denominador;
    }
}
