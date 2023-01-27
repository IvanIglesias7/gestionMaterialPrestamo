package gestionMaterialPrestamo.DTO;

import gestionMaterialPrestamo.DAL.alumnos;

/**
 * 
 * Clase que sirve para pasar de DTO a DAO
 *
 */
public class DTOtoServiceImpl implements DTOtoService {

	@Override
	public alumnos toDAOAlumnos(alumnoDTO alumDTO) {

		alumnos alumDAO = new alumnos();

		alumDAO.setNombre(alumDTO.getNombre());
		alumDAO.setNumTlf(alumDTO.getNumTlf());
		return alumDAO;
	}

}
