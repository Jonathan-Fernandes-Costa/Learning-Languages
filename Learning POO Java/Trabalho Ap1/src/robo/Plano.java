package robo;

import java.util.ArrayList;

public class Plano {

	public ArrayList<Celula> listaCelulas;
	private int tamanhox;
	private int tamanhoy;
	
	public Plano(int tamanhoX, int tamanhoY) {
		listaCelulas = new ArrayList<Celula>();
		tamanhox = tamanhoX;
		tamanhoy = tamanhoY;
		
		int contador = 1;
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(contador, i, j);
				listaCelulas.add(celula);
				contador++;
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
		for (int i = 0; i < tamanhox; i++) {
			for (int j = 0; j < tamanhoy; j++) {
				System.out.print(listaCelulas.get(contador).imprimir());
				contador++;
			}
			System.out.println();
		}

	}

}
