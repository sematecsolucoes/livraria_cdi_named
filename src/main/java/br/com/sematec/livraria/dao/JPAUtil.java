package br.com.sematec.livraria.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("livraria");

	public void close(EntityManager em) {
		em.close();
	}

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
