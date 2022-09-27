package manejoarchivos;

import java.io.*;// io imput out

public class ManejoArchivos {
    //crear, guardar inf , eliminar inf , eliminar por completo el archivo

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        // posiblemente puede arrojar una excepcion 

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();// se crea nuestro archivo en el disco duro
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.print(contenido); // print (recive ese parametro)
            salida.close();// se crea nuestro archivo en el disco duro
            System.out.println("Se ha escrito al  archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);// print (recive ese parametro)
            salida.close();// se crea nuestro archivo en el disco duro
            System.out.println("Se ha anexado al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //con esa clase  lee inf de un archivo
            //alamacenando caracter por caracter
            //FileReader no leee lineas completas
            //BufferedReader si lee lineas compleats de un archivo
            // puede arrojar exepciones asi que se agregra el try catch

            String lectura = entrada.readLine();
            // solo lee una linea
            while(lectura != null){// si la linea es diferente de vacia no se va a detener 
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();//se vueleve a llamar , se vuelve a leer una linea vacia
                // y si es igual a null entonces termina el ciclo
            }
            entrada.close();

            // al usar readLine puede arrojar una exepcion IOException
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
;

}
