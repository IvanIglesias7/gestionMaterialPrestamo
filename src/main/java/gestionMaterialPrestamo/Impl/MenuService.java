package gestionMaterialPrestamo.Impl;

import java.util.Scanner;

public interface MenuService {

	//Método que muestra el menú y devuelve la opcion señalada
	public int MostrarMenu(Scanner scan);
	
	public boolean MatriculaAlumno(ConsultasService consultas);
}
