package br.com.marcospcruz.icidades_api.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import br.com.marcospcruz.icidades_api.view.model.AnuncianteAgendamentoModel;

public class MainGui extends JFrame {

	public MainGui() {

		super("API Manager");
		setSize(800, 600);
		carregaJTable();
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void carregaJTable() {
		// TODO Auto-generated method stub
		AbstractTableModel model = new AnuncianteAgendamentoModel();
		JTable table = new JTable(model);
		

		JScrollPane jsPane = new JScrollPane();
		jsPane.setViewportView(table);
		add(jsPane);
	}

	public void start() {
		// TODO Auto-generated method stub
		setVisible(true);
	}

}
