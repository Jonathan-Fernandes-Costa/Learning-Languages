package front;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JFrame {
	private Painel_Cadastrar painelCadastro;
	private  Painel_Butoes painelButoes;
	private Painel_Atualizar painelAtualizar;
	private Painel_Deletar painelDeletar;
	private Painel_Listar painelListar;
	public Janela() {
		painelCadastro= new Painel_Cadastrar();
		painelAtualizar = new Painel_Atualizar();
		painelDeletar = new Painel_Deletar();
		painelListar = new Painel_Listar();
		painelButoes = new Painel_Butoes(painelCadastro, painelAtualizar, painelDeletar, painelListar);
		
		this.setSize(500, 500);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(painelButoes, BorderLayout.NORTH);
		this.add(painelAtualizar, BorderLayout.WEST);
		this.add(painelCadastro, BorderLayout.CENTER);
		this.add(painelDeletar, BorderLayout.EAST);
		this.add(painelListar, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
}
