package gestionMaterialPrestamo.DAL;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class portatilesRepositorioImpl implements portatilesRepositorio {

	@PersistenceContext
	EntityManager em;
	public void addPortatil(portatiles portatil) {
		
		em.persist(portatil);
		em.clear();
		
	}

}
