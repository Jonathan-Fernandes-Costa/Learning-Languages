package apresentação.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import apresentação.PainelPontos;
import controller.GerenciaJogo;

public class AoVerificar implements ActionListener{
	private GerenciaJogo jogo;
	private PainelPontos painel;
	private JButton botao;
	public AoVerificar(GerenciaJogo jogo, PainelPontos painel, JButton botao) {
		this.jogo = jogo;
		this.painel = painel;
		this.botao = botao;
	}

	public void actionPerformed(ActionEvent e) {
		if (jogo.verificaColisao()) {
			atualizaDadosdoPainel();
			botao.setEnabled(false);
		} else {
			JOptionPane.showMessageDialog(null, "Indique a posição das peças!");
		}

	}

	public void atualizaDadosdoPainel() {
		painel.pandador.setText(" : " + jogo.getRobo(0).getPontuacao());
		painel.pcavalo.setText(" : " + jogo.getRobo(1).getPontuacao());
		painel.prei.setText(" : " + jogo.getRobo(2).getPontuacao());
		painel.pontuacao.setText("Pontuação: " + jogo.getJogador().getPontuacao());
		painel.total.setText(" Total: ");
		painel.quantidadeAlunos.setText(": "+ jogo.getJogador().getAlunosRegatados());
		painel.quantidadeBugs.setText(": "+ jogo.getJogador().getBugsEncontrados());
		painel.revalidate();
		painel.repaint();
	}

}

