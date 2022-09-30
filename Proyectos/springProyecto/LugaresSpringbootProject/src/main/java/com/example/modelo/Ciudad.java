
package com.example.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ciudad")
public class Ciudad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idCiudad;
    
    
    @Column(name="nomCiudad")
    String nomCiudad;

    
    
    
    
    
    
}
