package servicio;

import datos.DepartamentoDao;
import domain.Departamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartamentoServicioImp implements DepartamentoServicio {

    @Autowired
    private DepartamentoDao DepartamentoDao;

    @Override
    public List<Departamento> listarDepartamento() {
        return DepartamentoDao.findAllDepartamento();
    }

    @Override
    public Departamento recuperarDepartamento(Departamento departamento) {
        return DepartamentoDao.findDepartamentoById(departamento.getIdDepartamento());
    }

    @Override
    public void agregarDepartamento(Departamento departamento) {
        DepartamentoDao.insertDepartamento(departamento);
    }
    

    @Override
    public void modificarDepartamento(Departamento departamento) {
        DepartamentoDao.updateDepartamento(departamento);
    }

    @Override
    public void eliminarDepartamento(Departamento departamento) {
        DepartamentoDao.deleteDepartamento(departamento);
    }

}
