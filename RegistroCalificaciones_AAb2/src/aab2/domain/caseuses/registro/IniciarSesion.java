package aab2.domain.caseuses.registro;

import aab2.domainn.IIniciarSesión;
import aab2.persistencia.IOperacionDB;

public class IniciarSesion implements IIniciarSesión{

    private IOperacionDB repositorio;

    public IniciarSesion(IOperacionDB repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public boolean logueo(String correo, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
