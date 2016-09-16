package br.com.marcospcruz.icidades_api.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.marcospcruz.icidades_api.model.AgendamentoXml;

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

	public List readAll(String namedQuery) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNamedQuery(namedQuery);
		List<AgendamentoXml> retorno = query.getResultList();
		closeEntityManager();
		return retorno;
	}

	public void closeEntityManager() {
		// TODO Auto-generated method stub
		if (entityManager.isOpen()) {
			entityManager.close();
			factory.close();
		}

	}

}
