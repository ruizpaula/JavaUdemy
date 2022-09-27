package mx.com.gm.peliculas.vista;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class CatalogoPeliculaVista {

    public static void main(String[] args) {
        //mostrar un menu
        int opcion = -1;
        // si no presiona la opcion 0 va a continuar el programa
        Scanner scanner = new Scanner(System.in);//y se pasa la consoola de entrada
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        //la capa de presentacion se comunica con la capa de negocio
        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar Catalogo Peliculas \n"
                    + "2. Agregar Pelicula \n"
                    + "3. Listar peliculas \n"
                    + "4. Buscar pelicula \n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());// se debe convertir al tipo de dato que se quiere convertir
            // si se utiliza otro metodo diferente de el metodo nextLine() consume toda la linea hasta los caracteres ...saltos de linea

            switch (opcion ) {
                case 1:
                    catalogo.iniciarArchivo();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    String nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce una pelicula a buscar");
                    String buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }

}

