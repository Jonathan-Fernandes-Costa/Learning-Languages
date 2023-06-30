package apresentação.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import apresentação.JanelaPrincipal;

public class AoClicar implements ActionListener{
		private int id;
		private JanelaPrincipal janela;
		private JButton botao;
		public AoClicar(int id, JanelaPrincipal janela, JButton botao) {
			this.id = id;
			this.janela = janela;
			this.botao = botao;
		}
		public void actionPerformed(ActionEvent e) {
			janela.getJogo().setCasaEscolhida(id);
			if(janela.getJogo().verificaMovimento()) {
				botao.setIcon(new ImageIcon(janela.getJogo().getRoboEscolhido().trataIcone()));
			}
			
		}
		
	}

