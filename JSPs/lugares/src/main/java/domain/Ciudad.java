package domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ciudad {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private Long idDepartamento;
    private String nombreCiudad;

    public Ciudad() {
    }

    public Ciudad(Long idDepartamento, String nombreCiudad) {
        this.idDepartamento = idDepartamento;
        this.nombreCiudad = nombreCiudad;
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "idDepartamento=" + idDepartamento + ", nombreCiudad=" + nombreCiudad + '}';
    }
    
    
}
