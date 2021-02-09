package aab2.domainn;

import aab2.domain.entities.Docente;

public interface IRegistro {
    public void registrarDocente(Docente docente);
    public boolean verificarExistenciaDocente(String correo);
}
