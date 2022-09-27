package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3307/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        //useSSL=false
        //& ---> para agregar mas parametros
        //useTimezone=true
        
        
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            //Statement  tipo interface
            //conexion.createStatement() implementacion del conector a  BD que se este usando  ,,, conector de mysql
            //Statement    permitor ejecutar     sentencias sobre la BD  
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            // debido a que la sentencia puede iterar mas de un registro 
            // iterat resultado en while
            while(resultado.next()){ //indica si hay un elementro por  iterar
                // se posisicona en el registro que se va iterar
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));// dato int   getInt
                //                                           bd
                
                System.out.print(" Nombre: " + resultado.getString("nombre"));// --------- datos tipo string  getString
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                // println con LN imprime una nueva linea
                System.out.print(" Telefono: " + resultado.getInt("telefono"));
                System.out.println("");
            }
            resultado.close(); // cerrar todos los objetos
            instruccion.close(); 
            conexion.close();
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
