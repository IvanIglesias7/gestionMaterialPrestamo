package gestionMaterialPrestamo.DAL;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class alumnosRepositorioImpl implements alumnosRepositorio {

	@PersistenceContext
	private EntityManager em;

	public void matriculaAlumno(alumnos alumno) {

		em.persist(alumno);
		em.clear();
	}

}
