package aab2.domain.caseuses.grupos;

import aab2.domain.entities.Materia;
import aab2.domainn.IMateria;
import aab2.persistencia.IOperacionDBGrupos;

public class AgregarMateria implements IMateria{
    private IOperacionDBGrupos repositorio;

    public AgregarMateria(IOperacionDBGrupos repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void crearMateria(Materia materia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
