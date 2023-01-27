package gestionMaterialPrestamo.Impl;

import java.util.Scanner;

public class MenuServiceImpl implements MenuService {

	@Override
	public int MostrarMenu(Scanner sca) {
		int opcion;
		System.out.println("--Menu--");
		System.out.println("0. Salir");
		System.out.println("1. Matricula alumno");
		System.out.println("2. Baja de un alumno");
		System.out.println("3. Alta de un portatil");
		System.out.println("4. Consulta portátil asignado a un alumno");
		System.out.println("5. Consulta alumno asignado a un portátil");
		System.out.println("6. Ver todos los alumnos con su asignación de portátil");
		System.out.println("Elige una opcion: ");
		opcion = sca.nextInt();

		return opcion;
	}

	@Override
	public boolean MatriculaAlumno(ConsultasService consultas) {
		// Declaro las variables donde voy a guardar los datos que inserte el usuario
		String numAlum, nombre, numtlf;

		// Abro el scanner para recoger lo que inserte el usuario
		Scanner scan = new Scanner(System.in);
		
		//Empiezo a preguntar y guardar en variables.
		System.out.println("[Menu.Service]Matricula del alumno");
		System.out.println("¿Nombre del alumno?: ");
		nombre = scan.next();
		System.out.println("¿Numero de telefono?: ");
		numtlf = scan.next();
		
		//
		
		
		
		
		
		
		return false;
	}

}
