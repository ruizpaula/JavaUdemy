package servicio;

import domain.Departamento;
import java.util.List;

public interface DepartamentoServicio {

    public List<Departamento> listarDepartamento();

    public Departamento recuperarDepartamento(Departamento departamento);

    public void agregarDepartamento(Departamento departamento);

    public void modificarDepartamento(Departamento departamento);

    public void eliminarDepartamento(Departamento departamento);

    
}
