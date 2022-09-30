package mx.com.gm.servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx.com.gm.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mx.com.gm.dao.ProductoDao;
import org.springframework.ui.Model;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> listarProducto() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void eliminar(Producto producto) {
        productoDao.delete(producto);
    }

   

    @Override
    @Transactional(readOnly = true) 
    public Producto encontrarProducto(Producto producto) {
        return productoDao.findById(producto.getCodigo()).orElse(null);
    }

    
    
    public String precioMayor() {
        List<Producto> listadoProducto = listarProducto();
        String nombre_mayor = listadoProducto.get(0).getNombre();
        double precio_mayor = listadoProducto.get(0).getPrecio();

        
        for (int i =0 ; i<listadoProducto.size(); i++) {
            if (listadoProducto.get(i).getPrecio() > precio_mayor) {
                //nombre = producto.getNombre();
                precio_mayor = listadoProducto.get(i).getPrecio(); 
                nombre_mayor = listadoProducto.get(i).getNombre(); 
            }
        }
        return nombre_mayor;
    }

    public String precioMenor() {
        List<Producto> listadoProducto = listarProducto();
        String nombre_menor = listadoProducto.get(0).getNombre();
        double precio_menor = listadoProducto.get(0).getPrecio();

        
        for (int i =0 ; i<listadoProducto.size(); i++) {
            if (listadoProducto.get(i).getPrecio() < precio_menor) {
                //nombre = producto.getNombre();
                precio_menor = listadoProducto.get(i).getPrecio();
                nombre_menor = listadoProducto.get(i).getNombre(); 
            }
        }
        return nombre_menor;
    }

    public String promedioPrecios() {
        List<Producto> listadoProducto = listarProducto();
        //List<Double> lista = new ArrayList<Double>();
        System.out.println(listadoProducto.get(0).getPrecio());
        double suma = 0, avg=0;
      
        for(int i =0 ; i<listadoProducto.size(); i++){
          suma += listadoProducto.get(i).getPrecio();
          avg = suma / listadoProducto.size();
        }
        return String.valueOf(avg);
    }

    public String totalinventario() {
        List<Producto> listarproductos = listarProducto();
        double inventario = 0;
        for (Producto producto : listarproductos) {
            inventario += producto.getPrecio() * producto.getInventario();
        }
        return String.valueOf(inventario);
    }

    @Override
    public String informe() {
        String mayor = precioMayor() ;
        String menor = precioMenor() ;
        String promedio = promedioPrecios();
        String total = totalinventario();
      
        return String.valueOf("El producto de precio mayor es "+ mayor+ " el producto de precio menor es "+ menor + " el prommedio precios es " 
                + promedio + " y valor del inventario es " + total);
        }

}
