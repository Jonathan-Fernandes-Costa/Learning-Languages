package questoes;

import java.util.Scanner;

public class questao4 {
	public static int filtro(int []vetor1, int []vetor2, int elemento) {
		int quantidade = 0;
		for(int i=0;i<vetor1.length;i++) {
			if(vetor1[i]==elemento) {
				quantidade++;
			}
		}
		for(int i=0;i<vetor2.length;i++) {
			if(vetor2[i]==elemento) {
				quantidade++;
			}
		}
		return quantidade;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o tamanho dos vetores");
			int tamanho = ler.nextInt();
			int []vetor1 = new int[tamanho];
			int []vetor2 = new int[tamanho];
			for(int i=0; i<vetor1.length;i++) {
				System.out.println("Digite o elemento: "+(i+1)+" do vetor 1");
				vetor1[i] = ler.nextInt();
			}
			for(int i=0; i<vetor2.length;i++) {
				System.out.println("Digite o elemento: "+(i+1)+" do vetor 2");
				vetor2[i] = ler.nextInt();
			}
			System.out.println("Digite o elemento a ser contado: ");
			int elemento = ler.nextInt();
			int quantidade = filtro(vetor1, vetor2, elemento);
			System.out.println("A quantidade de vezes que o elemento se repetiu foi: "+ quantidade);
		}
	}

}
