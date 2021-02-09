package aab2.domain.caseuses.grupos;

import aab2.domain.entities.Actividad;
import aab2.domainn.IActividad;
import aab2.persistencia.IOperacionDBGrupos;

public class AgregarActividad implements IActividad{
    private IOperacionDBGrupos repositorio;

    @Override
    public void crearActividad(Actividad actividad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}