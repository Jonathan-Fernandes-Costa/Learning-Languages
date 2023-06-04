package front;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel_Atualizar extends JPanel{
	
	public Painel_Atualizar() {
		this.setVisible(false);
		this.setBackground(Color.blue);
		this.setLayout(new GridLayout(3,2));
		JButton bCadastro2 = new JButton("Atualizar");
		JLabel matricula = new JLabel("Matricula: ");
		JLabel vertente = new JLabel("Vertente: ");
		JTextField campomatricula = new JTextField(20);
		JTextField campovertente= new JTextField(20);
		this.add(matricula);
		this.add(campomatricula);
		this.add(vertente);
		this.add(campovertente);
		this.add(bCadastro2);
	
	}
}
