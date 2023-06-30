package apresentação.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentação.JanelaPrincipal;

public class AoJogar implements ActionListener{
	private JanelaPrincipal janela;
	public AoJogar(JanelaPrincipal janela) {
		this.janela = janela;
	}
	public void actionPerformed(ActionEvent e) {
		janela.getJogo().NovoJogador(janela.getInicial().getCampoNome().getText());
		janela.getXadrez().setVisible(true);
		janela.getMenu().setVisible(true);

	}
}
