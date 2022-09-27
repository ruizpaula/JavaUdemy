package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDao {
    
    public  List<PersonaDTO> seleccionar() throws SQLException;
    // tipo List<PersonaDTO>

    public int insert(PersonaDTO persona) throws SQLException;

    public int actualizar(PersonaDTO persona) throws SQLException;

    public int eliminar(PersonaDTO persona) throws SQLException;

    

}
