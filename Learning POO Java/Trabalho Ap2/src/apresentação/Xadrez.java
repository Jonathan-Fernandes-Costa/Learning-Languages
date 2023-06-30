package apresentação;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import apresentação.eventos.AoClicar;
import controller.ArrayDeCasas;

public class Xadrez extends JPanel {
	private ArrayDeCasas casas;
	private ArrayList<BotaoCasa> botoes = new ArrayList<BotaoCasa>();
	private int botaoclicado;
	private JanelaPrincipal janela;

	public Xadrez(ArrayDeCasas casas, JanelaPrincipal janela) {
		this.casas = casas;
		this.janela = janela;
		this.setLayout(new GridLayout(8, 8));
		this.setPreferredSize(new Dimension(600, 600));
		for (int i = 0; i < casas.listaCasas.size(); i++) {
			BotaoCasa aux = new BotaoCasa(casas.listaCasas.get(i));
			aux.addActionListener(new AoClicar(aux.RetornaPosicao(), janela, aux));
			botoes.add(aux);
		}
		CustomizaBotoes();
		for (int i = 0; i < botoes.size(); i++) {
			this.add(botoes.get(i));
		}
		this.setVisible(false);
	}

	public void CustomizaBotoes() {
		for (int i = 0; i < 64; i++) {
			if ((i / 8) % 2 == 0) {
				if (i % 2 == 0) {
					botoes.get(i).setBackground(Color.yellow);
				} else {
					botoes.get(i).setBackground(Color.WHITE);
				}
			} else {
				if (i % 2 == 0) {
					botoes.get(i).setBackground(Color.WHITE);
				} else {
					botoes.get(i).setBackground(Color.yellow);
				}
			}
		}
	}

	public void atualizaBotoes() {
		for (int i = 0; i < botoes.size(); i++) {
			botoes.get(i).BotaoFoiVisitado();
		}
	}

}
