package aab2.domain.caseuses.registro;

import aab2.domain.entities.Docente;
import aab2.domainn.IRegistro;
import aab2.persistencia.IOperacionDB;

public class RegistroDocente implements IRegistro{

    private IOperacionDB repositorio;

    public RegistroDocente(IOperacionDB repositorio) {
        this.repositorio = repositorio;
    }
    
    @Override
    public void registrarDocente(Docente docente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarExistenciaDocente(String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
