package actions;

import com.opensymphony.xwork2.ActionSupport;
import domain.Departamento;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import servicio.DepartamentoServicio;

public class DepartamentoAction extends ActionSupport {

    private List<Departamento> departamentos;
    private Departamento departamento;
    @Autowired
    private DepartamentoServicio departamentoServicio;
    Logger log = LogManager.getLogger(DepartamentoAction.class);

    @Action(value = "/listar", results = {
        
        
        @Result(name = "departamentos", location = "/WEB-INF/content/departamentos.jsp")})
    public String listar() {
        this.departamentos = departamentoServicio.listarDepartamento();
        return "departamentos";

    }

    @Action(value = "/agregarDepartamento", results = {
        @Result(name = "departamento", location = "/WEB-INF/content/departamentos.jsp")})
    public String agregar() {
        //Creamos un nuevo objeto de tipo departamento
        departamento = new Departamento();
        return "departamento";
    }

    @Action(value = "/editarDepartamento", results = {
        @Result(name = "departamento", location = "/WEB-INF/content/departamentos.jsp")})
    public String editar() {
        departamento = departamentoServicio.recuperarDepartamento(departamento);
        return "departamento";
    }

    @Action(value = "/eliminarDepartamento", results = {
        @Result(name = "success", location = "listar", type = "redirect")})
    public String eliminar() {
        //Recuperamos el objeto persona, ya que solo tenemos el idDepartamento
        log.info("Metodo eliminar departamento antes de recuperar:" + departamento);
        departamento = departamentoServicio.recuperarDepartamento(departamento); //
        log.info("Metodo eliminar persona despues de recuperar:" + departamento);
        departamentoServicio.eliminarDepartamento(departamento);
        return SUCCESS;

    }

    //No basta con mandar al JSP, sino a la accion de listar
//por ello redireccionamos a la accion listar
    @Action(value = "/guardarDepartamento", results = {
        @Result(name = "success", location = "listar", type = "redirect")})
    public String guardar() {
//Diferenciamos la accion de agregar o editar con el idDepartamento
        if (departamento.getIdDepartamento() == null) {
            departamentoServicio.agregarDepartamento(departamento);
        } else {
            departamentoServicio.modificarDepartamento(departamento);
        }
        return SUCCESS;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
