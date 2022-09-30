
package com.example.interfaces;

import com.example.modelo.Ciudad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InCiudad extends  CrudRepository<Ciudad, Integer> {
    
}
