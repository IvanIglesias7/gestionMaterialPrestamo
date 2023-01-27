package gestionMaterialPrestamo.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import gestionMaterialPrestamo.DAL.*;

public class ConsultasServiceImpl implements ConsultasService {

	@Autowired
	alumnosRepositorio alum;

	@Override
	public boolean MatriculaAlumno(alumnos alumno) {

		try {

			alum.matriculaAlumno(alumno);
			System.out.println("[ConsultasService] Se ha insertado el alumno correctamente");

		} catch (Exception e) {
			System.out.println("[ConsultasService] No se ha insertado el alumno correctamente");
			System.out.println("[ERROR] " + e);
			return false;
		}
		return true;
	}
}
