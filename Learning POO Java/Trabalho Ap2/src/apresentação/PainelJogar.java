package apresentação;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import apresentação.eventos.AoProximaRodada;
import apresentação.eventos.AoSair;
import apresentação.eventos.AoVerificar;
import model.Casa;
import model.GerenciaJogo;

public class PainelJogar extends JPanel {
	private PainelPontos painelPontuacao;
	private JButton verificar;
	private JButton sair;

	public PainelJogar(JanelaPrincipal janela) {
		GerenciaJogo aux = janela.getJogo();
		painelPontuacao = new PainelPontos(janela);
		sair = new JButton("Encerrar Jogo");
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(290, 600));

		JButton andador = new JButton();
		andador.setIcon(aux.editaImagem(aux.getIconeAndador()));
		andador.addActionListener(e -> aux.setRoboEscolhido(aux.getRobo(0)));
		andador.setBackground(Color.white);
		JButton cavalo = new JButton();
		cavalo.setIcon(aux.editaImagem(aux.getIconeCavalo()));
		cavalo.addActionListener(e -> aux.setRoboEscolhido(aux.getRobo(1)));
		cavalo.setBackground(Color.white);
		JButton rei = new JButton();
		rei.setIcon(aux.editaImagem(aux.getIconeRei()));
		rei.addActionListener(e -> aux.setRoboEscolhido(aux.getRobo(2)));
		rei.setBackground(Color.white);
		verificar = new JButton("Verificar");
		verificar.addActionListener(new AoVerificar(aux, painelPontuacao, verificar));
		verificar.setBackground(Color.green);
		verificar.setPreferredSize(new Dimension(180, 40));
		JButton proxJogada = new JButton("Próxima Jogada");
		proxJogada.addActionListener(new AoProximaRodada(janela));
		proxJogada.setPreferredSize(new Dimension(180, 40));
		proxJogada.setBackground(Color.green);
		sair.addActionListener(new AoSair(janela));
		sair.setPreferredSize(new Dimension(180, 40));
		sair.setBackground(Color.red);
		this.setBackground(Color.white);
		this.add(painelPontuacao);
		this.add(andador);
		this.add(cavalo);
		this.add(rei);
		this.add(verificar);
		this.add(proxJogada);
		this.add(sair);
		this.setVisible(false);
	}

	public JButton getVerificar() {
		return verificar;
	}
}
