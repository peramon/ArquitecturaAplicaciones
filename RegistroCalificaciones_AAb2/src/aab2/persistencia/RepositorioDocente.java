package aab2.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class RepositorioDocente implements IOperacionDB{

    @Override
    public void insert(Docente docente) {
        DocenteJpaController jpaObject = new DocenteJpaController(Persistence.createEntityManagerFactory("RegistroCalificaciones_AAb2PU"));
        try {
            jpaObject.create(docente);
            //EntityManager em = Persistence.createEntityManagerFactory("RegistroCalificaciones_AAb2PU").createEntityManager();
            //System.out.println("d" +em.createQuery("SELECT * FROM DOCENTE", Docente.class).getResultList() );
        } catch (Exception ex) {
            Logger.getLogger(RepositorioDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Docente> getAll() {
        // DocenteJpaController jpaObject = new DocenteJpaController(Persistence.createEntityManagerFactory("RegistroCalificaciones_AAb2PU"));
        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("RegistroCalificaciones_AAb2PU");
        return em.createQuery("SELECT * FROM DOCENTE", Docente.class).getResultList();
    }

    @Override
    public boolean verificarExistencia(String correo) {
        List<Docente> objDocentes = getAll();
        for (int i = 0; i < objDocentes.size(); i++) {
            if (objDocentes.get(i).getCorreo().compareTo(correo)==0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean iniciarSesion(String correo, String password) {
        List<Docente> objDocentes = getAll();
        for (int i = 0; i < objDocentes.size(); i++) {
            if (objDocentes.get(i).getCorreo().compareTo(correo)==0 && objDocentes.get(i).getPassword().compareTo(correo)==0) {
                return true;
            }
        }
        return false;
    }
    
}
