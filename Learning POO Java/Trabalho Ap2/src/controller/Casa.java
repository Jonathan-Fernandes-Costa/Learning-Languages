package controller;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Casa {
	private int posicao;
	private Aluno aluno;
	private Bug bug;
	private boolean foiVisitada;
	private ImageIcon ImageBug = new ImageIcon("src/img/bug.png");
	private ImageIcon ImageAluno = new ImageIcon("src/img/aluno.png");
	
	public Casa(int posicao) {
		foiVisitada = false;
		this.posicao = posicao;
	}
	

	public int getPosicao() {
		return posicao;
	}
	

	public ImageIcon getImageBug() {
		return ImageBug;
	}


	public void setImageBug(ImageIcon imageBug) {
		ImageBug = imageBug;
	}


	public ImageIcon getImageAluno() {
		return ImageAluno;
	}


	public void setImageAluno(ImageIcon imageAluno) {
		ImageAluno = imageAluno;
	}


	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public Bug getBug() {
		return bug;
	}


	public void setBug(Bug bug) {
		this.bug = bug;
	}


	public boolean isFoiVisitada() {
		return foiVisitada;
	}


	public void setFoiVisitada(boolean foiVisitada) {
		this.foiVisitada = foiVisitada;
	}
	
	
	
	
}
