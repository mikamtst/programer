package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model.Setup;
import java.util.List;
import javax.persistence.TypedQuery;
import br.com.fiap.util.EntityManagerFacade;

public class SetupDao {

	public void save(Setup setup) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		
		manager.clear();
	}
	
	public List<Setup> getAll() {
		String jpql = "SELECT s FROM Setup s";
		TypedQuery<Setup> query = manager.createQuery(jpql, Setup.class);
		return query.getResultList();
		
	}


}
