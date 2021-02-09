package aab2.adaptadores;

import aab2.domain.entities.Estudiante;
import aab2.domain.entities.Materia;
import aab2.domain.entities.Nivel;
import aab2.domain.entities.Paralelo;
import aab2.domainn.IEstudiante;
import aab2.domainn.IMateria;
import aab2.domainn.INivel;
import aab2.domainn.IParalelo;
import aab2.persistencia.IOperacionDBGrupos;
import java.util.List;

public class GruposPort {
    private INivel nivel;
    private IParalelo paralelo;
    private IMateria materia;
    private IEstudiante estudiante;
    private IOperacionDBGrupos iOperacionDBGrupos;

    public GruposPort(INivel nivel, IParalelo paralelo, IMateria materia, IEstudiante estudiante, IOperacionDBGrupos iOperacionDBGrupos) {
        this.nivel = nivel;
        this.paralelo = paralelo;
        this.materia = materia;
        this.estudiante = estudiante;
        this.iOperacionDBGrupos = iOperacionDBGrupos;
    }
    
    public void crearGrupo(Nivel nivel, Paralelo paralelo, Materia materia, List<Estudiante> estudiante){
        
    }
}
