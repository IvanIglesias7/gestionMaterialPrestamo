package gestionMaterialPrestamo.DTO;

public class toDTOServiceImpl implements toDTOService {
	
	@Override
	public alumnoDTO alumnoaDTO(String numAlum, String nombre, String numTlf) {
		
		alumnoDTO alumnoaDTO = new alumnoDTO(numAlum, nombre, numTlf);
		
		return alumnoaDTO;
	}

	
}
