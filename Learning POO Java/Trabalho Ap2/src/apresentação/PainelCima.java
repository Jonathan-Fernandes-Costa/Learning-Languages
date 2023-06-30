package apresentação;

import javax.swing.JPanel;
import javax.swing.JTextField;

import apresentação.eventos.AoJogar;
import apresentação.eventos.AoSair;
import controller.GerenciaJogo;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PainelCima extends JPanel {
	private Xadrez xadrez;
	private PainelJogar menu;
	private GerenciaJogo jogo;
	private JTextField campoNome;
	private JanelaPrincipal janela;

	public PainelCima(JanelaPrincipal janela) {
		this.janela = janela;
		JLabel name = new JLabel("Digite seu nome: ");
		campoNome = new JTextField(25);
		JButton jogar = new JButton("Jogar");
		// jogar.setBackground(Color.blue);
		jogar.addActionListener(new AoJogar(janela));
		jogar.setPreferredSize(new Dimension(95, 50));
		jogar.setBackground(Color.green);
		JButton relatorios = new JButton("Relatórios");
		relatorios.setBackground(Color.CYAN);
		relatorios.setPreferredSize(new Dimension(95, 50));
		relatorios.addActionListener(new AoSair(janela));
		this.setBackground(Color.white);
		this.add(name);
		this.add(campoNome);
		this.add(jogar);
		this.add(relatorios);
	}
	public JTextField getCampoNome() {
		return campoNome;
	}
}
