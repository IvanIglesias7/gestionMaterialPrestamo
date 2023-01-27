package gestionMaterialPrestamo.Controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gestionMaterialPrestamo.Impl.ConsultasService;
import gestionMaterialPrestamo.Impl.MenuService;
import gestionMaterialPrestamo.Impl.MenuServiceImpl;

public class gestionMaterial {

	public static void main(String[] args) {
		// Contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ConsultasService consulta = (ConsultasService) context.getBean(ConsultasService.class);

		// Inicio variables
		int opcion;
		MenuService ms = new MenuServiceImpl();
		Scanner scan = new Scanner(System.in);

		boolean seguir = true;

		while (!seguir) {

			opcion = ms.MostrarMenu(scan);
			switch (opcion) {
			case 0:
				seguir = false;
				System.out.println("Hasta otra!");
				break;
			case 1: 
				System.out.println("Has elegido la opcion 1");

			default:
				break;
			}

		}
	}

}
