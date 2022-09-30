
package com.example.interfaceServicio;

import com.example.modelo.Departamento;
import java.util.List;
import java.util.Optional;


public interface InDepartamentoServicio {
    public List<Departamento> listar();
    public Optional<Departamento> listarID(int id);
    public int guardar(Departamento d);
    public void eleminar(int id);
    
}
