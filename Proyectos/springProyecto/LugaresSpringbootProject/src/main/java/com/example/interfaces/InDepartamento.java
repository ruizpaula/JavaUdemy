
package com.example.interfaces;

import com.example.modelo.Departamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InDepartamento extends CrudRepository<Departamento, Integer>{
    
}
