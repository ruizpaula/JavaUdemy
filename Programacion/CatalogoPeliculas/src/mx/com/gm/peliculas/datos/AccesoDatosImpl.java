package mx.com.gm.peliculas.datos;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

    //se inplementas todos los metyodos de la interface
    @Override //sobrescritura
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists(); // si existe el archivo

    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        File archivo = new File(nombre);
        List<Pelicula> peliculas = new ArrayList<>();// si es coleccion es en plural
        try {
            //leer el archivo BufferedReader
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();// este metodo puede arrojar una exepcion 
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);//se agrega a la lista un obj de tipo pelicula
                linea = entrada.readLine();// si hay una nueva linea se repite el ciclo while
            }
            entrada.close();//cerrar el while

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.print(pelicula.toString()); // para que imprima una nueva linea ..... print (recive ese parametro)
            // luego de enviar esto al archivo

            salida.close();
            System.out.println("Se ha escrito informacion al  archivo : " + pelicula);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        //se define una variable para almacenar el resultado
        String resultado = null;

        try {
            //leer el archivo BufferedReader
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //linea guarda la inf que hay dentro del archivo mas no el nuemro
            String linea = null;// almacena cada una de las lineas que se estara leyendo
            linea = entrada.readLine();//se lee la linea
            int indice = 1;// para  que mas adelante se vaya incrementando conforme vaya leyendo las lineas de cada archivo
            //1° linea valor 1
            //el indice donde se encuentra la pelicula
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {// && si es igual a la linea que se leyo
                    //equalsIgnoreCase si en el caso de que este escrita con mayuscula o minuscula

                    resultado = "Pelicula encontrada " + linea + " encontrada en la linea " + indice;
                    break; //romper el ciclo
                }
                //si no coincide la busqueda
                linea = entrada.readLine();//se lee la siguiente y se incrementa el indice
                indice++; // y la sieguiente vez if(buscar != null && buscar.equalsIgnoreCase(linea))
                //si se encuentra la pelicula ...

            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula: " + ex.getMessage());

        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula: " + ex.getMessage());
        }

        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);//se utiliza nombreArchivo
        // posiblemente puede arrojar una excepcion 

        try {
            //abrir el flujo de salida
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));;
            salida.close();// IMPORTANTE con .close() se crea el archivo 
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al crear archivo pelicula: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al crear archivo pelicula: " + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);//se pasa el nombre del archivo
        //preguntar si de verdad existe
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Se ha eliminado el archivo");
        }

    }

}
