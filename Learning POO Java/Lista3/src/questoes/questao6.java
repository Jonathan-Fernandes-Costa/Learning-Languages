package questoes;

import java.util.Scanner;

public class questao6 {
	public static int[] ordena(int []vetor){
		int temp;
		for(int i=0; i<vetor.length;i++) {
			 for (int j = i + 1; j < vetor.length; j++) {
		            if (vetor[i] > vetor[j]) {
		                temp = vetor[i];
		                vetor[i] = vetor[j];
		                vetor[j] = temp;
		            }
		      }
		}
		return vetor;
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
			int []vetorordenado = ordena(vetor1);
			System.out.println("Vetor ordenado: ");
			for(int i=0; i<vetorordenado.length;i++) {
				System.out.print(vetorordenado[i]);
			}
		}

	}

}
