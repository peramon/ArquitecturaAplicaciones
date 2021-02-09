package aab2.adaptadores;

import aab2.domain.entities.Docente;
import aab2.domainn.IRegistro;
import aab2.persistencia.IOperacionDB;

public class RegistroPort {
    private IRegistro registro;
    private IOperacionDB iOperacionDbDocente;

    public RegistroPort(IRegistro registro, IOperacionDB iOperacionDbDocente) {
        this.registro = registro;
        this.iOperacionDbDocente = iOperacionDbDocente;
    }

    public void RegistrarDocente(Docente docente){
        
    }
}
