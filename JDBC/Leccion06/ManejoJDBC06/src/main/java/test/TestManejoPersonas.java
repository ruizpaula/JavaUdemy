package test;

import datos.Conexion;
import datos.PersonaDao;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;

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

//            PersonaDaoJDBC personJdbc = new PersonaDaoJDBC(conexion);    //constructor que recibe el objt conexion
                // Se utilizara la interface PersonaDao para comunicarse con PersonaDaoJDBC
                
            PersonaDao personaDao = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDao.seleccionar();
            
            for (PersonaDTO persona : personas){
                System.out.println("personaDTO = " + persona);
                
            }

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
