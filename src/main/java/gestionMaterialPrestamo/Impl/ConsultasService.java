package gestionMaterialPrestamo.Impl;

import gestionMaterialPrestamo.DAL.alumnos;

public interface ConsultasService {

	/**
	 * Inserta el alumno en la base de datos controlando cualquier error
	 * devolviendo true o false dependiendo de si se ha podido hacer
	 * la accion.
	 */
	public boolean MatriculaAlumno(alumnos alumno);
}
