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

public class Painel_Deletar extends JPanel {
	private Banco banco;
	private EscreverDados Escrever = new EscreverDados();
	private	JLabel matricula = new JLabel("Matricula: ");
	private JTextField campomatricula = new JTextField(20);

	public Painel_Deletar(Banco banco) {
		this.banco = banco;
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(2, 2));
		JPanel Aux = new JPanel();
		Aux.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(575,200));
		
		JButton bDeletar2 = new JButton("Deletar");
		bDeletar2.addActionListener(new AoDeletar());
		this.add(matricula);
		this.add(campomatricula);
		this.add(Aux);
		this.add(bDeletar2);
		this.setVisible(false);
	}
	
	private class AoDeletar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String Mat = campomatricula.getText();
			int MatVelha = 0;
			int MatNovo = 0;
			
			for (int i = 0; i < banco.getQuantAlunos(); i++) {
				
				MatVelha = Integer.parseInt(banco.getMatricula(i));
				MatNovo = Integer.parseInt(Mat);
				
				if(MatVelha == MatNovo) {
					banco.excluirAluno(i);
					JOptionPane.showMessageDialog(null, "Aluno deletado com SUCESSO!", "DELETAR ALUNO", JOptionPane.INFORMATION_MESSAGE);
					Escrever.escreverDados(banco.formatarDados());
				}
				
			}
			
			campomatricula.setText("");
		}
	}
}
