package aab2.domain.caseuses.grupos;

import aab2.domain.entities.Estudiante;
import aab2.domainn.IEstudiante;
import aab2.persistencia.IOperacionDBGrupos;

public class AgregarEstudiante implements IEstudiante{
    private IOperacionDBGrupos repositorio;

    public AgregarEstudiante(IOperacionDBGrupos repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void crearEstudiante(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}