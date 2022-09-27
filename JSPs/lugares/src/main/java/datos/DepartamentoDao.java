package datos;

import domain.Departamento;
import java.util.List;

public interface DepartamentoDao {

    void insertDepartamento(Departamento departamento);

    void updateDepartamento(Departamento departamento);

    void deleteDepartamento(Departamento departamento);

    Departamento findDepartamentoById(long idDepartamento);

    List<Departamento> findAllDepartamento();


}
