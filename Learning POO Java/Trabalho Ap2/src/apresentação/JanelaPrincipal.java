package apresentação;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ArrayDeCasas;
import controller.GerenciaJogo;

public class JanelaPrincipal extends JFrame{
	private GerenciaJogo jogo;
	private Xadrez painelXadrez;
	private PainelJogar painelJogar;
	private PainelCima painelCima;
	private PainelRelatorio painelRelatorio;
	private JPanel painelInferior = new JPanel();
	public int botaoClicado;
	public JanelaPrincipal() {
		jogo = new GerenciaJogo(this);
		painelJogar = new PainelJogar(this);
		painelXadrez = new Xadrez(jogo.getCasas() ,this);
		painelCima = new PainelCima(this);
		
		
		this.setSize(900,700);
		this.setTitle("Ap2");
		this.setLayout(new BorderLayout());
		painelInferior.setLayout(new BorderLayout());
		painelInferior.add(painelJogar, BorderLayout.EAST);
		painelInferior.add(painelXadrez, BorderLayout.WEST);
		this.add(painelCima, BorderLayout.NORTH);
		this.add(painelInferior, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	public GerenciaJogo getJogo() {
		return jogo;
	}
	public void geraRelatorio() {
		painelRelatorio = new PainelRelatorio(this,jogo);
	}
	public PainelJogar getMenu() {
		return painelJogar;
	}
	public Xadrez getXadrez() {
		return painelXadrez;
	}
	public PainelCima getInicial() {
		return painelCima;
	}
	public PainelRelatorio getRelatorio() {
		return painelRelatorio;
	}
	public JPanel getPaineilInferior() {
		return painelInferior;
	}
}
