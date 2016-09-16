package br.com.marcospcruz.icidades_api.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO {

	private EntityManagerFactory factory;
	protected EntityManager entityManager;

	public AbstractDAO() {
		iniciaEntityManager();
	}

	private void iniciaEntityManager() {
		// TODO Auto-generated method stub
		if (entityManager == null) {
			factory = Persistence.createEntityManagerFactory("icidades_api_pu");
			entityManager = factory.createEntityManager();
		}
	}

	public abstract List readAll(String namedQuery);

	public void closeEntityManager() {
		// TODO Auto-generated method stub
		if (entityManager.isOpen()) {
			entityManager.close();
			factory.close();
		}

	}

}
