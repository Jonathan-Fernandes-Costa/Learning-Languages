package front;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Painel_Deletar extends JPanel{
	public Painel_Deletar() {
		this.setBackground(Color.blue);
		this.setLayout(new GridLayout(2,2));
		JButton bDeletar2 = new JButton("Deletar");
		JLabel matricula = new JLabel("Matricula: ");
		JTextField campomatricula = new JTextField(20);
		this.add(matricula);
		this.add(campomatricula);
		this.add(bDeletar2);
		this.setVisible(false);
}}
