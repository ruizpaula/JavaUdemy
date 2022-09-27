package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

//        // ----------   Insertando un nuevo objeto de tipo Persona -------
//        Persona personaNueva = new Persona("Sara Valentina", "Ruiz", "saraaaaa@mail.com", "9987909");
//        personaDao.insertar(personaNueva);

//        // ---------------  Modificar un objeto de persona existente -----------
//        Persona personaModificar = new Persona(8, "Sara Valentina", "Ruiz", "sararuiz78@gmail.com", "9987909");
//        personaDao.actualizar(personaModificar);
//        
        
        
        // -------------- Eliminar un registr tipo Persona --------------
//        Persona personaEliminar = new Persona(4);
//        personaDao.eliminar(personaEliminar);
        
        
        
        // -----------    Listado Persona -----------------------
        
        List<Persona> personas = personaDao.seleccionar();
//        for(Persona persona: personas){
//            System.out.println("persona = " + persona);
//        }
        
// el IDE utilizar una funcion 
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
