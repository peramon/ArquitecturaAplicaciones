package aab2.domain.caseuses.grupos;

import aab2.domain.entities.Paralelo;
import aab2.domainn.IParalelo;
import aab2.persistencia.IOperacionDBGrupos;

public class AgregarParalelo implements IParalelo{
    private IOperacionDBGrupos repositorio;

    public AgregarParalelo(IOperacionDBGrupos repositorio) {
        this.repositorio = repositorio;
    }
    
    @Override
    public void crearParalelo(Paralelo paralelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}