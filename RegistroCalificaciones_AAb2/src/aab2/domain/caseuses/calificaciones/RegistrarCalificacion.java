package aab2.domain.caseuses.calificaciones;

import aab2.domainn.ICalificacion;
import aab2.persistencia.IOperacionDBCalificacion;

public class RegistrarCalificacion implements ICalificacion{
    //private IOperacionDBCalificacion repositorio;

    public RegistrarCalificacion(/*IOperacionDBCalificacion repositorio*/) {
        //this.repositorio = repositorio;
    }

    @Override
    public void ingresarNota(double calificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarNota(double calificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
