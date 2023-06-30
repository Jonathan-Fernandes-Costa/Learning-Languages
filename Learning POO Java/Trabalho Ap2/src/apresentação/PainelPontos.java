package apresentação;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Casa;
import controller.GerenciaJogo;

public class PainelPontos extends JPanel {
	private JanelaPrincipal janela;
	public JLabel pontuacao;
	public JLabel total;
	public JLabel pandador;
	public JLabel pcavalo;
	public JLabel prei;
	public JLabel quantidadeAlunos;
	public JLabel quantidadeBugs;
	private BotaoCasa casa = new BotaoCasa(new Casa(333));

	public PainelPontos(JanelaPrincipal janela) {
		this.janela = janela;
		this.setBackground(Color.white);
		GerenciaJogo aux = janela.getJogo();
		pontuacao = new JLabel("Pontuação: 0");
		total = new JLabel("Total: ");
		JLabel iconAluno = new JLabel(casa.editaImagem(casa.getCasa().getImageAluno()));
		quantidadeAlunos = new JLabel(": 0");
		JLabel iconBug = new JLabel(casa.editaImagem(casa.getCasa().getImageBug()));
		quantidadeBugs = new JLabel(": 0");
		quantidadeBugs.setPreferredSize(new Dimension(50, 20));
		JLabel andador = new JLabel(new ImageIcon(aux.getRobo(0).trataIcone2()));
		pandador = new JLabel(" : 0");
		JLabel cavalo = new JLabel(new ImageIcon(aux.getRobo(1).trataIcone2()));
		pcavalo = new JLabel(" : 0");
		JLabel rei = new JLabel(new ImageIcon(aux.getRobo(2).trataIcone2()));
		prei = new JLabel(" : 0");
		this.setPreferredSize(new Dimension(285, 90));
		this.add(pontuacao);
		this.add(total);
		this.add(iconAluno);
		this.add(quantidadeAlunos);
		this.add(iconBug);
		this.add(quantidadeBugs);
		this.add(andador);
		this.add(pandador);
		this.add(cavalo);
		this.add(pcavalo);
		this.add(rei);
		this.add(prei);
		this.setVisible(true);
	}

}
