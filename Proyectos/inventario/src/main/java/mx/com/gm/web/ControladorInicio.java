package mx.com.gm.web;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import mx.com.gm.servicio.ProductoService;
import org.springframework.transaction.annotation.Transactional;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String inicio(Model model) {
        var productos = productoService.listarProducto();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("productos", productos);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Producto producto) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Producto producto) {
        productoService.guardar(producto);
        return "redirect:/";
    }

    @GetMapping("/editar/{codigo}")
    public String editar(Producto producto, Model model) {
        producto = productoService.encontrarProducto(producto);
        model.addAttribute("producto", producto);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Producto producto) {
        productoService.eliminar(producto);
        return "redirect:/";
    }

    
    @GetMapping("/informe")
    public String informe(Model model) {

        String informe = productoService.informe();
        model.addAttribute("informe", informe);
        return "index";
    }

}
