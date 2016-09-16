package br.com.marcospcruz.icidades_api.view.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import br.com.marcospcruz.icidades_api.dao.AgendamentoXmlDAO;
import br.com.marcospcruz.icidades_api.model.AgendamentoXml;

public class AnuncianteAgendamentoModel extends AbstractTableModel {

	private AgendamentoXmlDAO dao;
	private static final String[] COLUNAS = new String[] {
			"Código Agendamento", "Código Assinante" };
	private String[][] linhas;
	private static final String FIND_ALL = "Agendamentoxml.findAll";

	public AnuncianteAgendamentoModel() {
		super();
		dao = new AgendamentoXmlDAO();
		List<AgendamentoXml> dados = dao.readAll(FIND_ALL);
		carregaLinhas(dados);
		System.out.println();
	}

	private void carregaLinhas(List<AgendamentoXml> dados) {
		// TODO Auto-generated method stub
		linhas = new String[dados.size()][COLUNAS.length];

		for (int i = 0; i < dados.size(); i++) {
			AgendamentoXml agendamento = dados.get(i);
			String[] colunas = new String[COLUNAS.length];
			colunas[0] = Integer.toString(agendamento.getId());
			colunas[1] = Integer.toString(agendamento.getFkAnunciante());
			linhas[i] = colunas;

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
