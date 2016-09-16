package br.com.marcospcruz.icidades_api.view.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.marcospcruz.icidades_api.dao.AgendamentoXmlDAO;
import br.com.marcospcruz.icidades_api.dao.AnuncianteDAO;
import br.com.marcospcruz.icidades_api.model.AgendamentoXml;
import br.com.marcospcruz.icidades_api.model.Anunciante;

public class AnuncianteAgendamentoModel extends AbstractTableModel {

	private AnuncianteDAO dao;
	private static final String[] COLUNAS = new String[] { "Código Assinante",
			"Código Agendamento" };
	private String[][] linhas;
	private static final String FIND_ALL = "Anunciante.findAll";

	public AnuncianteAgendamentoModel() {
		super();
		dao = new AnuncianteDAO();
		List<Anunciante> dados = dao.readAll(FIND_ALL);
		carregaLinhas(dados);

	}

	private void carregaLinhas(List<Anunciante> dados) {
		// TODO Auto-generated method stub
		linhas = new String[dados.size()][COLUNAS.length];
		int linha = 0;
		for (int i = 0; i < dados.size(); i++) {
			Anunciante anunciante = dados.get(i);
			List<AgendamentoXml> agendamento = (List<AgendamentoXml>) anunciante
					.getAgendamentos();
			for (int j = 0; j < agendamento.size(); j++) {

				String[] colunas = new String[COLUNAS.length];
				// colunas[0] = Integer.toString(agendamento.getId());
				colunas[0] = anunciante.getId().toString();
				colunas[1] = "";

				colunas[1] = agendamento.get(j).getId().toString();
				linhas[linha] = colunas;
				linha++;
			}

		}

	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return linhas.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return COLUNAS.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return linhas[rowIndex][columnIndex];
	}

	public String getColumnName(int index) {
		return COLUNAS[index];
	}
}
