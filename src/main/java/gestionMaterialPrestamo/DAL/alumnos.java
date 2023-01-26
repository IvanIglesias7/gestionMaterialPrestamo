package gestionMaterialPrestamo.DAL;

import javax.persistence.*;

/*
 * Entidad que apunta a la tabla alumnos de la base de datos. 
  */
@Entity
@Table(name = "alumnos", schema = "dlk_MaterialesPrestamo")
public class alumnos {

	// ATRIBUTOS

	@Id // Indica que es un PrimaryKey
	private String numAlum;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "numTlf")
	private String numTlf;

	@OneToOne
	portatiles portatil;

	// GETTERS AND SETTERS

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
