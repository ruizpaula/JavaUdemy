package datos;

import domain.Departamento;
import java.util.List;
import javax.persistence.CacheStoreMode;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoImp implements DepartamentoDao {

    Logger log = LogManager.getRootLogger();
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertDepartamento(Departamento departamento) {
        em.persist(departamento);
    }

    @Override
    public void updateDepartamento(Departamento departamento) {
        em.merge(departamento);
    }

    @Override
    public void deleteDepartamento(Departamento departamento) {
        em.remove(em.merge(departamento));
    }

    @Override
    public Departamento findDepartamentoById(long idDepartamento) {
        return em.find(Departamento.class, idDepartamento);
    }

    @Override
    public List<Departamento> findAllDepartamento() {
        String jpql = "SELECT d FROM Departamento d";
        Query query = em.createQuery(jpql);
        //Forzar a ir directamente a la base de datos para refrescar datos
        query.setHint("javax.persistence.cache.storeMode", CacheStoreMode.REFRESH);
        List<Departamento> departamentos = query.getResultList();
        System.out.println("personas:" + departamentos);
        return departamentos;
    }

    

}
