package aab2.adaptadores;

import aab2.domainn.IIniciarSesión;
import aab2.persistencia.IOperacionDB;

public class LogeoPort {
    private IIniciarSesión logeo;
    private IOperacionDB iOperacionDB;

    public LogeoPort(IIniciarSesión logeo, IOperacionDB iOperacionDB) {
        this.logeo = logeo;
        this.iOperacionDB = iOperacionDB;
    }
    
    public boolean logueo(String correo, String password){
        return true;
    }
}