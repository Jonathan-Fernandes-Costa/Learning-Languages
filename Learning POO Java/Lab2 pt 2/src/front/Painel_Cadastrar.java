package front;

import java.awt.BorderLayout;
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

public class Painel_Cadastrar extends JPanel{
	//front
	private JLabel nome = new JLabel("Nome: ");
	private JLabel cpf = new JLabel("CPF: ");
	private JLabel matricula = new JLabel("Matricula: ");
	private JLabel vertente = new JLabel("Vertente: ");
	private JTextField campomatricula = new JTextField(25);
	private JTextField camponome = new JTextField(25);
	private JTextField campocpf= new JTextField(25);
	private JTextField campovertente= new JTextField(25);
	
	//back
	private Banco banco;
	private EscreverDados cadastro = new EscreverDados();;
	
	public Painel_Cadastrar(Banco banco) {
		this.banco = banco;
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(5,2));
		JButton bCadastro2 = new JButton("Cadastrar");
		bCadastro2.addActionListener(new AoCadastrar());
		
		JPanel Aux = new JPanel();
		Aux.setBackground(Color.LIGHT_GRAY);

		this.setPreferredSize(new Dimension(575,500));
		this.add(nome);
		this.add(camponome);
		this.add(cpf);
		this.add(campocpf);
		this.add(matricula);
		this.add(campomatricula);
		this.add(vertente);
		this.add(campovertente);
		this.add(Aux);
		this.add(bCadastro2);
		this.setVisible(false);

	}
	private class AoCadastrar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String Nome = camponome.getText();
			String CPF = campocpf.getText();
			String Mat = campomatricula.getText();
			String Vert = campovertente.getText();
			int MatVelha = 0;
			int MatNovo = 0;
			int Cont = 0;
			
			camponome.setText("");
			campocpf.setText("");
			campomatricula.setText("");
			campovertente.setText("");
			
			for (int i = 0; i < banco.getQuantAlunos(); i++) {
				
				MatVelha = Integer.parseInt(banco.getMatricula(i));
				MatNovo = Integer.parseInt(Mat);
				
				if(MatVelha == MatNovo) {
					JOptionPane.showMessageDialog(null, "O Banco já possui um aluno com essa matrícula! CADASTRE UM ALUNO COM UMA MATRÍCULA NOVA!", "CADASTRO INVÁLIDO", JOptionPane.ERROR_MESSAGE);
					Cont++;
				}
				
			}
			
			if(Cont == 0) {
				banco.adicionarAluno(Nome, CPF, Mat, Vert);
				JOptionPane.showMessageDialog(null, "Cadastro realizado com SUCESSO!", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
				cadastro.escreverDados(banco.formatarDados());
			}
			
		}
	}
}
