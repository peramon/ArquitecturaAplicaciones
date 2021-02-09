package aab2.domain.caseuses.grupos;

import aab2.domain.entities.Nivel;
import aab2.domainn.INivel;
import aab2.persistencia.IOperacionDBGrupos;

public class AgregarNivel implements INivel{
    
    private IOperacionDBGrupos repositorio;
    
    public AgregarNivel() {
        this.repositorio = repositorio;
    }

    @Override
    public void crearNivel(Nivel nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
