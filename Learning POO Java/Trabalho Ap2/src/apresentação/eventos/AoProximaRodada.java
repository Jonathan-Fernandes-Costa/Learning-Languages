package apresentação.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import apresentação.JanelaPrincipal;

public class AoProximaRodada implements ActionListener{
	private JanelaPrincipal janela;
	public AoProximaRodada(JanelaPrincipal janela) {
		this.janela = janela;
	}
	public void actionPerformed(ActionEvent e) {
		if(!janela.getMenu().getVerificar().isEnabled()) {
			janela.getXadrez().atualizaBotoes();
			atualizaPainel(janela.getXadrez());
			janela.getMenu().getVerificar().setEnabled(true);
			janela.getJogo().proximaRodada();
			janela.getJogo().escreverDados();
		}else {
			JOptionPane.showMessageDialog(null, "Verifique antes");
		}
		
	}
	
	public void atualizaPainel(JPanel painel) {
		
		painel.revalidate();
		painel.repaint();
	}
}
