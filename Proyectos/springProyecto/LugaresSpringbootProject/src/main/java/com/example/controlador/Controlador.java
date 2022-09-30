

package com.example.controlador;

import com.example.interfaceServicio.InDepartamentoServicio;
import com.example.modelo.Departamento;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controlador {
    
    
    @Autowired
    //para implementar el metodo
    private InDepartamentoServicio service;
    
    @GetMapping("/listar")
    public String listar(Model model){
         List<Departamento> departamentos = service.listar() ;
         model.addAttribute("departamentos", departamentos);
        return "index";
    } 
    
    
    
    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("departamentos", new Departamento());
        return "formulario";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Departamento d, Model model){
        //guardar en la bd
        service.guardar(d);
        
        return "redirect:/listar";
    }
    
    
    @GetMapping("/ediar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Departamento> departamento = service.listarID(id);
        model.addAttribute("departamento", departamento );
        return "formulario";
    }
    
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id, Model model){
        service.eleminar(id);
        return "redirect:/listar";
    }
    
    
}
