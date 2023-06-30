package apresentação.eventos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentação.JanelaPrincipal;

public class AoSair implements ActionListener{
	private JanelaPrincipal janela;
	public AoSair(JanelaPrincipal janela) {
		this.janela = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		janela.remove(janela.getMenu());
		janela.remove(janela.getInicial());
		janela.remove(janela.getXadrez());
		janela.remove(janela.getPaineilInferior());
		janela.geraRelatorio();
		janela.add(janela.getRelatorio(), BorderLayout.CENTER);
		janela.revalidate();
		janela.repaint();
	}
}
