package questao18;

import java.util.ArrayList;
import java.util.Iterator;

public class Area {
	
	private ArrayList<Casa> casas;
	private int dimensaox;
	private int dimensaoy;
	
	public Area(int tamanhox, int tamanhoy) {
		casas = new ArrayList<Casa>();
		dimensaox = tamanhox;
		dimensaoy = tamanhoy;
		int contador = 1;
		for (int i = 1; i <= tamanhox; i++) {
			for (int j = 1; j <= tamanhoy; j++) {
				Casa casa = new Casa(contador, i, j);
				casas.add(casa);
				contador++;
			}
		}
	}
	
	public void verificarSeTemRobo() {
		for (int i = 0; i < casas.size(); i++) {
			Casa aux = casas.get(i);
			if (casas.get(i).getRobo() != null) {
				System.out.println("tem robo"+ " Posição: "+ "  - x: " + aux.getPosicaoX() + "  - y: " + aux.getPosicaoY());
			}
		}
	}
	public void retornarCasas() {
		int contador=0;
		System.out.println(" ");
		for (int i = 0; i < dimensaox; i++) {
			for (int j = 0; j < dimensaoy; j++) {
				System.out.print(casas.get(contador).imprimir());
				contador++;
			}
			 System.out.println();
		}
	}
	public Casa retornarCasa(int x, int y) {

		for (int i = 0; i < casas.size(); i++) {
			if (casas.get(i).getPosicaoX() == x && casas.get(i).getPosicaoY() == y) {
				return casas.get(i);
			}
		}
		return null;
	}
	public ArrayList<Casa> getCasas() {
		return casas;
	}
	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}
	public int getDimensaox() {
		return dimensaox;
	}
	public void setDimensaox(int dimensaox) {
		this.dimensaox = dimensaox;
	}
	public int getDimensaoy() {
		return dimensaoy;
	}
	public void setDimensaoy(int dimensaoy) {
		this.dimensaoy = dimensaoy;
	}
}
