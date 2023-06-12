package front;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

import back.Banco;
import controllers.LerDados;


public class Janela extends JFrame {
	//Front
	private JPanel PainelCima = new JPanel();
	private JPanel PainelBaixo = new JPanel();
	private Painel_Cadastrar painelCadastro;
	private  Painel_Butoes painelButoes;
	private Painel_Atualizar painelAtualizar;
	private Painel_Deletar painelDeletar;
	private Painel_Listar painelListar;
	//Back
	private Banco banco;
	private LerDados ler = new LerDados();
	public Janela() {
		
		banco = new Banco();
		ler.lerDados("dados/Alunos.txt");
		banco.setListaAlunos(ler.getLista());
		
		painelCadastro= new Painel_Cadastrar(banco);
		painelAtualizar = new Painel_Atualizar(banco);
		painelDeletar = new Painel_Deletar(banco);
		painelListar = new Painel_Listar(banco);
		painelButoes = new Painel_Butoes(painelCadastro, painelAtualizar, painelDeletar, painelListar, banco);
		
		this.setSize(600, 600);
		this.setLayout(new BorderLayout());
		this.setTitle("Sistema de Alunos");
		
		
		PainelCima.add(painelButoes);
		
		PainelBaixo.setLayout(new FlowLayout());
		//PainelBaixo.setPreferredSize(new Dimension(1600,800));
		PainelBaixo.add(painelCadastro);
		PainelBaixo.add(painelListar);
		PainelBaixo.add(painelAtualizar);
		PainelBaixo.add(painelDeletar);
		this.add(PainelCima, BorderLayout.NORTH);
		this.add(PainelBaixo, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
