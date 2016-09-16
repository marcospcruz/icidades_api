package br.com.marcospcruz.icidades_api.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.marcospcruz.icidades_api.model.AgendamentoXml;

public class AgendamentoXmlDAO extends AbstractDAO {

	public AgendamentoXmlDAO() {
		super();
	}

	@Override
	public List<AgendamentoXml> readAll(String namedQuery) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNamedQuery(namedQuery);
		List<AgendamentoXml> retorno = query.getResultList();
		super.closeEntityManager();
		return retorno;
	}

}
