package br.com.marcospcruz.icidades_api.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO {

	private EntityManagerFactory factory;
	private EntityManager entityManager;
	
	public AbstractDAO(){
		iniciaEntityManager();
	}

	private void iniciaEntityManager() {
		// TODO Auto-generated method stub
		if(entityManager==null){
			factory=Persistence.createEntityManagerFactory("icidades_api_pu");
			entityManager=factory.createEntityManager();
		}
	}
	
}
