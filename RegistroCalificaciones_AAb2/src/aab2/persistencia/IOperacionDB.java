package aab2.persistencia;

import java.util.List;

public interface IOperacionDB {
    public void insert(Docente docente);
    public List<Docente> getAll();
    public boolean verificarExistencia(String correo);
    public boolean iniciarSesion(String correo, String password);

    //public void insert(aab2.domain.entities.Docente objDocenrepo);
}
