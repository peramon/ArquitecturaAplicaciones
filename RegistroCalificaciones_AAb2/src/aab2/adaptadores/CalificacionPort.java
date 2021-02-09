package aab2.adaptadores;

import aab2.domainn.ICalificacion;
import aab2.persistencia.IOperacionDBCalificacion;

public class CalificacionPort {
    private ICalificacion iCalificacion;
    private IOperacionDBCalificacion iOperacionDBCalificacion;

    public CalificacionPort(ICalificacion iCalificacion, IOperacionDBCalificacion iOperacionDBCalificacion) {
        this.iCalificacion = iCalificacion;
        this.iOperacionDBCalificacion = iOperacionDBCalificacion;
    }
    
    public void ingresarNota(double calificacion){
        
    }
    
    public void actualizarCalificacion (double calificacion){
        
    }
}
