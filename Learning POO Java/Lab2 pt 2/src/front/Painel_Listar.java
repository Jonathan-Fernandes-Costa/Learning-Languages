package front;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import back.Banco;


public class Painel_Listar extends JPanel{
	private Banco banco;
	public Painel_Listar(Banco banco) {
		this.banco = banco;
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(575,500));
		JLabel text = new JLabel("Tabela: ");
		String Dados[][] = new String[banco.getQuantAlunos()][4];

		for (int i = 0; i < Dados.length; i++) {
			
			Dados[i][0] = banco.getNome(i);
			Dados[i][1] = banco.getCPF(i);
			Dados[i][2] = banco.getMatricula(i);
			Dados[i][3] = banco.getVertente(i);
			
		}
		
		String[] Colunas = {"Nome", "CPF", "Matrícula", "Vertente"};

        DefaultTableModel Modelo = new DefaultTableModel(Dados, Colunas);

        JTable Tabela = new JTable(Modelo);
        
        Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);
		
		JScrollPane PainelRolagem = new JScrollPane(Tabela);
		PainelRolagem.setPreferredSize(new Dimension(550,480));

        this.add(PainelRolagem);
        this.add(text);
		this.setVisible(false);
	}
	
	public void atualizarLista(Banco banco) {
		
		this.removeAll();
		
		this.banco = banco;
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(575,500));

		
		String Dados[][] = new String[banco.getQuantAlunos()][4];
		
		for (int i = 0; i < Dados.length; i++) {
			
			Dados[i][0] = banco.getNome(i);
			Dados[i][1] = banco.getCPF(i);
			Dados[i][2] = banco.getMatricula(i);
			Dados[i][3] = banco.getVertente(i);
			
		}
		
		String[] Colunas = {"Nome", "CPF", "Matricula", "Vertente"};

		DefaultTableModel Modelo = new DefaultTableModel(Dados, Colunas);

        JTable Tabela = new JTable(Modelo);
        
        Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);
		
		JScrollPane PainelRolagem = new JScrollPane(Tabela);
		PainelRolagem.setPreferredSize(new Dimension(550,480));

        this.add(PainelRolagem);
	}
		
		
		
	}

