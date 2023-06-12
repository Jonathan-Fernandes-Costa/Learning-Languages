package front;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import back.Banco;



public class Painel_Butoes extends JPanel {
	private	Painel_Cadastrar painelCadastro ;
	private Painel_Atualizar painelAtualizar;
	private Painel_Deletar painelDeletar;
	private Painel_Listar painelListar;
	private Banco banco;
	public Painel_Butoes(Painel_Cadastrar painelCadastro, Painel_Atualizar painelAtualizar1, Painel_Deletar painelDeletar, Painel_Listar painelListar, Banco banco) {
		this.painelCadastro = painelCadastro;
		this.banco = banco;
		this.painelAtualizar = painelAtualizar1;
		this.painelDeletar = painelDeletar;
		this.painelListar = painelListar;
		JButton bCadastro = new JButton("Cadastrar");
		bCadastro.addActionListener(new AoCadastrar());
		JButton bListar = new JButton("Listar");
		bListar.addActionListener(new AoListar());
		JButton bAtualizar = new JButton("Atualizar");
		bAtualizar.addActionListener(new AoAtualizar());
		JButton bDeletar = new JButton("Deletar");
		bDeletar.addActionListener(new AoDeletar());
		this.add(bCadastro);
		this.add(bListar);
		this.add(bAtualizar);
		this.add(bDeletar);

	}

	public class AoCadastrar implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			painelAtualizar.setVisible(false);
			painelDeletar.setVisible(false);
			painelListar.setVisible(false);
			painelCadastro.setVisible(true);

		}

	}
	public class AoListar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			painelCadastro.setVisible(false);
			painelDeletar.setVisible(false);
			painelAtualizar.setVisible(false);
			painelListar.atualizarLista(banco);
			painelListar.setVisible(true);
			
		}
		
	}
	public class AoAtualizar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			painelCadastro.setVisible(false);
			painelDeletar.setVisible(false);
			painelListar.setVisible(false);
			painelAtualizar.setVisible(true);
		}
		
	}
	public class AoDeletar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			painelCadastro.setVisible(false);
			painelAtualizar.setVisible(false);
			painelListar.setVisible(false);
			painelDeletar.setVisible(true);
			
		}
		
	}
	

}