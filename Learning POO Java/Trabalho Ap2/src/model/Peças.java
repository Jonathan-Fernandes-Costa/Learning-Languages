package model;


import java.awt.Image;

import javax.swing.ImageIcon;

public class Peças {
	private int posicao;
	private int pontuacao;
	private String nome;
	private ImageIcon icon;
	
	public Peças(String nome, ImageIcon icon) {
		this.nome = nome;
		pontuacao = 0;
		posicao = -1;
		this.icon = icon;
	}
	public Image trataIcone() {
		Image imagem = icon.getImage();
		Image novaImage = imagem.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
		return novaImage;
	}
	public Image trataIcone2() {
		Image imagem = icon.getImage();
		Image novaImage = imagem.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		return novaImage;
	}
	public void achouAluno() {
		this.pontuacao +=10;
	}
	public void achouBug() {
		this.pontuacao -=15;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontos) {
		this.pontuacao = pontos;
	}
	public ImageIcon getIcon() {
		return icon;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
}
