
package prueba;

import java.util.Scanner;

public class EjercicioConductor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nuemro de turnos ");
        int turno = Integer.parseInt(scanner.nextLine());
        while (turno > 15 ){
        System.out.println("Este es un numero mayor a 15");
            System.out.println("Ingresa un numero , debe ser menor de 15  ");
            turno = Integer.parseInt(scanner.nextLine());
        }for (int i = 0; i < turno; i++) {
                   System.out.println("Ingresa la informacion del conductor" + i);
                   System.out.println("Cedula");
                   int cedula = Integer.parseInt(scanner.nextLine());
                   System.out.println("Nombre:");
                   String  nombre = scanner.nextLine();
                   System.out.println("Ingresa el numero de la placa");
                   String  placa = scanner.nextLine();
            }
        
        
            
            

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingresa un numero , debe ser menor de 15 ");
//        int turno = Integer.parseInt(scanner.nextLine());
//        while (turno > 15 ){
//            System.out.println("Este es un numero mayor a 15");
//            System.out.println("Ingresa un numero , debe ser menor de 15  ");
//            turno = Integer.parseInt(scanner.nextLine());
//        }
//        System.out.println("Listo , continua ");
        
        
    }
}
