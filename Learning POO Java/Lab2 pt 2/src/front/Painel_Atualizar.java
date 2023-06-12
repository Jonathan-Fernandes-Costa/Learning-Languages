package front;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import back.Banco;
import controllers.EscreverDados;


public class Painel_Atualizar extends JPanel{
	private Banco banco;
	private EscreverDados Escrever = new EscreverDados();
	private JLabel matricula = new JLabel("Matricula: ");
	private JLabel vertente = new JLabel("Vertente: ");
	private JTextField campomatricula = new JTextField(20);
	private JTextField campovertente= new JTextField(20);
	public Painel_Atualizar(Banco banco) {
		this.banco = banco;
		this.setVisible(false);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(3,2));
		JPanel Aux = new JPanel();
		Aux.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(575,300));
		
		JButton bAtualizar = new JButton("Atualizar");
		bAtualizar.addActionListener(new AoAtualizar());
		this.add(matricula);
		this.add(campomatricula);
		this.add(vertente);
		this.add(campovertente);
		this.add(Aux);
		this.add(bAtualizar);
	
	}
	private class AoAtualizar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String Mat = campomatricula.getText();
			String Vert = campovertente.getText();
			int MatVelha = 0;
			int MatNovo = 0;
			
			for (int i = 0; i < banco.getQuantAlunos(); i++) {
				
				MatVelha = Integer.parseInt(banco.getMatricula(i));
				MatNovo = Integer.parseInt(Mat);
				
				if(MatVelha == MatNovo) {
					banco.setVertente(i, Vert);
					JOptionPane.showMessageDialog(null, "Aluno atualizado com SUCESSO!", "ATUALIZAÇÃO", JOptionPane.INFORMATION_MESSAGE);
					Escrever.escreverDados(banco.formatarDados());
				}
				
			}
			
			campomatricula.setText("");
			campovertente.setText("");
		}
	}
}
