package robo;

import java.util.ArrayList;

public class Celula {

	private int posicaoX;
	private int posicaoY;
	private int id;
	private ArrayList<Robo> robos;	
	private int alunoEbug;//aluno==1, bug==2;
	private String print = " * ";
	

	public Celula(int id, int x , int y) {
		robos = new ArrayList<Robo>();
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		alunoEbug=0;
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String imprimirPosicao() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
	public boolean verificaRobo() {
		System.out.println(robos.size());
		for (int i = 0; i < robos.size(); i++) {
			if(robos.get(i) != null) {
				return true;
			}
		}
		return false;
	}
	public String printRobo(int id) {
		return ("tem robo: " + robos.get(id).getNome()+"  - x: " + posicaoX + "  - y: " + posicaoY);
	}
	public ArrayList<Robo> getRobos() {
		return robos;
	}

	public void apagaRobo(Robo robo) {
		for (int i = 0; i < robos.size(); i++) {
			if(robos.get(i) == robo) {
				robos.set(i, null);
			}
		}
	}
	public String imprimir() {
		for (int i = 0; i < robos.size(); i++) {
			if(robos.get(i) != null) {
				return robos.get(i).getPrint();
			}
		}
		return print;
	}

	public int getAlunoEbug() {
		return alunoEbug;
	}

	public void setAlunoEbug(int alunoEbug) {
		this.alunoEbug = alunoEbug;
	}
	public void setPrint(String print) {
		this.print = print;
	}
}
