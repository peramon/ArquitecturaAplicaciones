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
        if (repositorio.iniciarSesion(correo, password)) {
            return true;
        }else{
            return false;
        }

    }
    
}
