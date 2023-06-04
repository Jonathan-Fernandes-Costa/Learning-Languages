package front;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel_Cadastrar extends JPanel{

	public Painel_Cadastrar() {
		this.setBackground(Color.blue);
		this.setLayout(new GridLayout(5,2));
		JButton bCadastro2 = new JButton("Cadastrar");
		JLabel nome = new JLabel("Nome: ");
		JLabel cpf = new JLabel("CPF: ");
		JLabel matricula = new JLabel("Matricula: ");
		JLabel vertente = new JLabel("Vertente: ");
		JTextField campomatricula = new JTextField(20);
		JTextField camponome = new JTextField(20);
		JTextField campocpf= new JTextField(20);
		JTextField campovertente= new JTextField(20);
		this.add(nome);
		this.add(camponome);
		this.add(cpf);
		this.add(campocpf);
		this.add(matricula);
		this.add(campomatricula);
		this.add(vertente);
		this.add(campovertente);
		this.add(bCadastro2);
		this.setVisible(false);

	}
}
