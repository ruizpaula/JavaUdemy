package accesodatos;

public class implementacionMySql implements IAccesoDatos {// implementa la interfaz

    // esta clase implementa el comportamiento 
    // si no se coloca metodos hay que colocar la palabra abstract
    //public abstract class  implementacionMySql implements IAccesoDatos{
    @Override // sobre escribiendo el metodo de la clase definido en la interfaz
    public void insertar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // no se ha implementado el metodo 
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {//se implementa estos metodos en la interfaz
       System.out.println("Listar desde MySql"); 
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");
    }

}
