package mx.com.gm.dao;

import mx.com.gm.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long>{
    
}
