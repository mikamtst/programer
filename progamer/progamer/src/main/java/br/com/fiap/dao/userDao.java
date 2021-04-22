package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Setup;
import br.com.fiap.model.User;

public class userDao {

	public void save(User user) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			} catch (Exception e) {
				em.getTransaction().rollback();
				e.printStackTrace();
			}
		
		em.close();
	}
	
	public List<User> getAll() {
		String jpql = "SELECT s FROM User s";
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		return query.getResultList();
		
	}

}
