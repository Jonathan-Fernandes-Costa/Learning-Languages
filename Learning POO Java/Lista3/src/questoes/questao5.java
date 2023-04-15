package questoes;

import java.util.Scanner;

public class questao5 {
	public static int[] copiaVetor(int []vetor) {
		int[] copia = new int[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
	        copia[i] = vetor[i];
	    }
		return copia;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o tamanho do vetor");
			int tamanho = ler.nextInt();
			int []vetor1 = new int[tamanho];
			for(int i=0; i<vetor1.length;i++) {
				System.out.println("Digite o elemento: "+(i+1));
				vetor1[i] = ler.nextInt();
			}
			int []copia = copiaVetor(vetor1);
			System.out.println("A copia do vetor é: ");
			for(int i=0; i<copia.length;i++) {
				System.out.print(copia[i]);
			}
		}

	}

}
