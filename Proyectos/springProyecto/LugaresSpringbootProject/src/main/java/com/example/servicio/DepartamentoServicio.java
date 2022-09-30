
package com.example.servicio;

import com.example.interfaceServicio.InDepartamentoServicio;
import com.example.interfaces.InDepartamento;
import com.example.modelo.Departamento;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServicio implements InDepartamentoServicio{
    
    @Autowired
    private InDepartamento repository;
    
    //implementar el metodo listar

    @Override
    public List<Departamento> listar() {
         return (List<Departamento>)repository.findAll();
    }

    @Override
    public Optional<Departamento> listarID(int id) {
        return repository.findById(id);
    }

    @Override
    public int guardar(Departamento d) {
        int respuesta = 0;
        //guadado el obj Departamento
        Departamento departamento = repository.save(d);
        if(!departamento.equals(null)){
            respuesta =1;
        }
        return 0;
    }

    @Override
    public void eleminar(int id) {
         repository.deleteById(id);
    }
   
    
    

    
    
}
