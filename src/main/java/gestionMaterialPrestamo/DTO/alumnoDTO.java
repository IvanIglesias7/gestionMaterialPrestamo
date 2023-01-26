package gestionMaterialPrestamo.DTO;

public class alumnoDTO {

	
	private String numAlum;
	private String nombre;
	private String numTlf;
	
	public alumnoDTO(String numAlum, String nombre, String numTlf) {
		super();
		this.numAlum = numAlum;
		this.nombre = nombre;
		this.numTlf = numTlf;
	}
	
	public alumnoDTO() {}
	
	
	public String getNumAlum() {
		return numAlum;
	}
	public void setNumAlum(String numAlum) {
		this.numAlum = numAlum;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumTlf() {
		return numTlf;
	}
	public void setNumTlf(String numTlf) {
		this.numTlf = numTlf;
	}
	
	
}
