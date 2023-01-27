package gestionMaterialPrestamo.DTO;

/**
 * 
 * Clase que sirve para pasar de DAO a DTO
 *
 */

public class toDTOServiceImpl implements toDTOService {

	@Override
	public alumnoDTO alumnoaDTO(String nombre, String numTlf) {

		alumnoDTO alumnoaDTO = new alumnoDTO(nombre, numTlf);

		return alumnoaDTO;
	}

}
