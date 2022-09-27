package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {

    private Connection conTran;

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";// 1 , 2 ,3 ,4
    //1 nombre, 2 apellido, 3 email, 4 telefono
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";

    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    public PersonaDAO() {

    }

    // constructor que recibe el objeto conexionTransaccional de tipo Connection
    public PersonaDAO(Connection conTran) {
        this.conTran = conTran;
    }

    /* es la misma coneccion a la bd sino que 
     !!!  ---> la diferencia es que la conexionTransaccional NO CIERRA  al ejecutar uno  de esos metodos
    se mantiene abierta
    
    la Transaccional se maneja fuera de esta clase
    
    la clase  externa ---> cuano hacer comit o roolback de toda la Transaccion
     */
    public List<Persona> seleccionar() throws SQLException {
        //inicializar variables
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = this.conTran != null ? this.conTran : Conexion.getConnection();

            // 😀si se obtuvo la conexionTransaccional entonces se debe de cerrar ese obj en este metodo    -----------------------------------
            /* si el obj conexionTransaccional != null entonces es 
            utilizar el obj de conexionTransaccional 
            de lo contrario obtenemos una conexion
            
             🙁 si se obtuvo la Conexion por medio del objeto conexionTransaccional  NO SE DEBE CERRAR EL OBJ ___ SE CERRARIA LA TRNSACCION
            
            
             */
            ps = conn.prepareStatement(SQL_SELECT); //ejecutar  el mismo statement con diferentes parametros
            rs = ps.executeQuery();//ejecuta 
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, email, telefono);

                personas.add(persona);

            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                if (this.conTran == null) {
                    Conexion.close(conn);// 😀si se obtuvo la conexionTransaccional entonces se debe de cerrar ese obj en este metodo ------------------
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return personas;
    }

    public int insertar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0; //para saber cuantos registros se modifican 
        try {
            conn = this.conTran != null ? this.conTran : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, persona.getNombre()); // indice 
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getEmail());
            ps.setString(4, persona.getTelefono());
            System.out.println("Ejecutando query SQL_INSERT = " + SQL_INSERT);
            registros = ps.executeUpdate();// regresa la cantidad de regstros modificados
            System.out.println("numero de registros insertados = " + registros);

        } finally {
            try {
                close(ps);
                if (this.conTran == null) {
                    Conexion.close(conn);// 😀si se obtuvo la conexionTransaccional entonces se debe de cerrar ese obj en este metodo ------------------
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = this.conTran != null ? this.conTran : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getEmail());
            ps.setString(4, persona.getTelefono());
            ps.setInt(5, persona.getIdPersona());
            System.out.println("Ejecutando query SQL_UPDATE = " + SQL_UPDATE);
            registros = ps.executeUpdate();// regresa la cantidad de regstros modificados
            System.out.println("numero de registros actualizados = " + registros);

        } finally {
            try {
                close(ps);
                if (this.conTran == null) {
                    Conexion.close(conn);// 😀si se obtuvo la conexionTransaccional entonces se debe de cerrar ese obj en este metodo ------------------
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = this.conTran != null ? this.conTran : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, persona.getIdPersona());
            registros = ps.executeUpdate();// regresa la cantidad de regstros modificados
        } finally {
            try {
                close(ps);
                if (this.conTran == null) {
                    Conexion.close(conn);// 😀si se obtuvo la conexionTransaccional entonces se debe de cerrar ese obj en este metodo ------------------
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
