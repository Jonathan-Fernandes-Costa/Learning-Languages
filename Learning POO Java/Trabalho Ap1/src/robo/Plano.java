package robo;

import java.util.ArrayList;
import java.util.Random;

public class Plano {

	public ArrayList<Celula> listaCelulas;
	private int tamanhox;

	private int tamanhoy;
	private Random random;
	private int tamanho;

	public Plano(int tamanhoX, int tamanhoY) {
		random = new Random();
		listaCelulas = new ArrayList<Celula>();
		tamanhox = tamanhoX;
		tamanhoy = tamanhoY;
		tamanho = tamanhox * tamanhoy;
		int contador = 1;
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(contador, i, j);
				listaCelulas.add(celula);
				contador++;
			}
		}
	}

	public int verificaRobo(Robo robo) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			for (int j = 0; j < listaCelulas.get(i).getRobos().size(); j++) {
				if (listaCelulas.get(i).getRobos().get(j) == robo) {
					if (listaCelulas.get(i).getAlunoEbug() == 1) {
						robo.achouAluno();
						return 1;
					} else if (listaCelulas.get(i).getAlunoEbug() == 2) {
						robo.achouBug();
						return 2;
					}
				}
			}

		}
		return 3;
	}

	public void apagaAlunoEncontrado() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			for (int j = 0; j < listaCelulas.get(i).getRobos().size(); j++) {
				if (listaCelulas.get(i).getRobos().get(j) != null) {
					if (listaCelulas.get(i).getAlunoEbug() == 1) {
						listaCelulas.get(i).setAlunoEbug(0);
					}
				}
			}
		}
	}

	public void verificarSeTemRobo() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			Celula aux = listaCelulas.get(i);
			if (aux.verificaRobo()) {
				aux.printRobo(i);
				// System.out.println("tem robo" + aux.getRobos().get(i)" - x: " +
				// aux.getPosicaoX() + " - y: " + aux.getPosicaoY());
			}
		}
	}

	public Celula retornarCelula(int x, int y) {

		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).getPosicaoX() == x && listaCelulas.get(i).getPosicaoY() == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.println(listaCelulas.get(i).imprimir());
		}
	}

	public void printPlano() {
		int contador = 0;
		System.out.println(" ");
		for (int j = 0; j < tamanhoy + 2; j++) {
			System.out.print(" - ");
		}
		System.out.println(" ");
		for (int i = 0; i < tamanhox; i++) {
			System.out.print(" | ");
			for (int j = 0; j < tamanhoy; j++) {
				System.out.print(listaCelulas.get(contador).imprimir());
				contador++;
			}
			System.out.print(" | ");
			System.out.println();
		}
		for (int j = 0; j < tamanhoy + 2; j++) {
			System.out.print(" - ");
		}
		System.out.println(" ");
		System.out.println(" ");
	}

	public int getTamanho() {
		return tamanho;
	}

	public int getTamanhox() {
		return tamanhox;
	}

	public void setTamanhox(int tamanhox) {
		this.tamanhox = tamanhox;
	}

	public int getTamanhoy() {
		return tamanhoy;
	}

	public void setTamanhoy(int tamanhoy) {
		this.tamanhoy = tamanhoy;
	}
}
