package aab2.domain.caseuses.registro;

import aab2.domain.entities.Docente;
import aab2.domainn.IRegistro;
import aab2.persistencia.IOperacionDB;
import java.util.List;

public class RegistroDocente implements IRegistro{

    private IOperacionDB repositorio;

    public RegistroDocente(IOperacionDB repositorio) {
        this.repositorio = repositorio;
    }
    
    @Override
    public void registrarDocente(Docente docente) {
        Docente objDocente = docente;
        if (!verificarExistenciaDocente(docente.getCorreo())) {
            aab2.domain.entities.Docente objDocenrepo = new aab2.domain.entities.Docente();
            objDocenrepo.setNombres(docente.getNombres());
            objDocenrepo.setCedula(docente.getCedula());
            objDocenrepo.setCelular(docente.getCelular());
            objDocenrepo.setCorreo(docente.getCorreo());
            objDocenrepo.setPassword(docente.getPassword());
            objDocenrepo.setProvincia(docente.getPassword());
            objDocenrepo.setTelefono(docente.getTelefono());
            //repositorio.insert(objDocenrepo);
        }
        
    }

    @Override
    public boolean verificarExistenciaDocente(String correo) {
        return repositorio.verificarExistencia(correo);
    }

   
    
}
