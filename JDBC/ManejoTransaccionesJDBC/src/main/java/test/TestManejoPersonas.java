package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try { // se cierra la conexion
            conexion = Conexion.getConnection();
            // se valida si la conexion esta en modo  autocomit
            // por default esta en true , al terminar de ejecutarse una sentencia se guardaran los cambios
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);// se indica que no se haga auto commit inmediata sino que hasta cuando se indique
            }// hasta que se haga commit se guardaran los cambios

            PersonaDAO personDao = new PersonaDAO(conexion);    //constructor que recibe el objt conexion

//            Persona cambioPersona = new Persona();
//            cambioPersona.setIdPersona(2);
//            cambioPersona.setNombre("Jennifer");
//            cambioPersona.setApellido("Gomez");
//            cambioPersona.setEmail("Jenni23@hotmail.com");
//            cambioPersona.setTelefono("875649878");
//            personDao.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona(11);

//            nuevaPersona.setNombre("Antonio");
//            //nuevaPersona.setNombre("casereshf3847ty47tyghuhgggggggg4536565455555555555555555555555555555gggggggggggggggggggggggggggggggggggggggg9999384398989858ggg");
//            nuevaPersona.setApellido("Ramirez");
//            personDao.insertar(nuevaPersona);
             
             personDao.eliminar(nuevaPersona);

            conexion.commit();// hasta este moemnto se van a guardar los cambios
            System.out.println("Se ha hecho comit de la transaccion ");

        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }

}
