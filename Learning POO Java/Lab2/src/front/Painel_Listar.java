package front;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel_Listar extends JPanel{
	public Painel_Listar() {
		this.setBackground(Color.blue);
		this.setLayout(new GridLayout(1,2));
		JLabel text = new JLabel("Tabela: ");
		this.add(text);
		this.setVisible(false);
		
	}
}
