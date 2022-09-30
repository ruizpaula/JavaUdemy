package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Producto;
import org.springframework.ui.Model;

public interface ProductoService {

    public List<Producto> listarProducto();

    public void guardar(Producto producto);

    public void eliminar(Producto producto);

    public Producto encontrarProducto(Producto producto);
    
    public String informe();
}
