package gestionMaterialPrestamo.DAL;

import javax.persistence.*;

/*
 * Entidad que apunta a la tabla portatiles de la base de datos. 
 */
@Entity
@Table(name = "portatiles", schema = "dlk_MaterialesPrestamo")
public class portatiles {

	// ATRIBUTOS

	@Id // Indica que es un PrimaryKey
	@Column(name = "portatil_id")
	int portatil_id;

	@Column(name = "marca")
	String marca;

	@Column(name = "modelo")
	String modelo;

	@OneToOne(mappedBy = "portatiles")
	alumnos alumno;

	// GETTERS AND SETTERS
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public alumnos getAlumno() {
		return alumno;
	}

	public void setAlumno(alumnos alumno) {
		this.alumno = alumno;
	}

}
