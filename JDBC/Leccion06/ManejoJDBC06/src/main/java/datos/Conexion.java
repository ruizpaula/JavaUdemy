package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3307/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    //crear un obj para inicializar el pool de conexiones y con ese mismo obj se vuelve a solicitar una conexion a la bd
    public static DataSource getDatasource(){
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(JDBC_URL);
        bds.setUsername(JDBC_USER);
        bds.setPassword(JDBC_PASSWORD);
        // definir el tamaño inicial del pool de conexiones
        bds.setInitialSize(5);
        return bds;
        
    }
    
    
    
    public static Connection getConnection() throws SQLException {
        return getDatasource().getConnection();  // getConnection() solicita un obj conexion del poll de conxiones que ya se configuro
        //return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); ----> DriverManager para obtener la conexion
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
        
}
