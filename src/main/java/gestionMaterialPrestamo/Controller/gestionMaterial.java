package gestionMaterialPrestamo.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gestionMaterialPrestamo.Impl.ConsultasService;
import gestionMaterialPrestamo.Impl.MenuService;

public class gestionMaterial {

	public static void main(String[] args) {
		// Contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ConsultasService consulta = (ConsultasService) context.getBean(ConsultasService.class);

		// Inicio variables
		MenuService ms;
		int opcion;
		
	
	}

}
