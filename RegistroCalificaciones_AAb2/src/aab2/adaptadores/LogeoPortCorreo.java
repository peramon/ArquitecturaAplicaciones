package aab2.adaptadores;

import aab2.domainn.IIniciarSesión;
import aab2.persistencia.IOperacionDB;

public class LogeoPortCorreo {
    private IIniciarSesión logeo;
    private IOperacionDB iOperacionDB;

    public LogeoPortCorreo(IIniciarSesión logeo, IOperacionDB iOperacionDB) {
        this.logeo = logeo;
        this.iOperacionDB = iOperacionDB;
    }
    
    public boolean logueo(String correo, String password){
        System.out.println(":)");
        return true;
    }
}