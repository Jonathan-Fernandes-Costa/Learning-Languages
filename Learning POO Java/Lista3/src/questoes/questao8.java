package questoes;

import java.util.Scanner;

public class questao8 {
	public static int kEsimoMaior(int[] vetor, int k) {
	    int indiceK = vetor.length - k; // Índice do K-ésimo maior valor
	    int inicio = 0;
	    int fim = vetor.length - 1;
	    while (true) {
	        int pivot = particionar(vetor, inicio, fim);
	        if (pivot == indiceK) {
	            return vetor[pivot];
	        } else if (pivot > indiceK) {
	            fim = pivot - 1;
	        } else {
	            inicio = pivot + 1;
	        }
	    }
	}

	private static int particionar(int[] vetor, int inicio, int fim) {
	    int pivot = vetor[fim];
	    int i = inicio - 1;
	    for (int j = inicio; j < fim; j++) {
	        if (vetor[j] < pivot) {
	            i++;
	            int temp = vetor[i];
	            vetor[i] = vetor[j];
	            vetor[j] = temp;
	        }
	    }
	    int temp = vetor[i + 1];
	    vetor[i + 1] = vetor[fim];
	    vetor[fim] = temp;
	    return i + 1;
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
			System.out.println("Digite o k");
			int k = ler.nextInt();
			int kesimo = kEsimoMaior(vetor1, k);
			System.out.println("O K-ésimo valor maior é: "+ kesimo);
		}
	}

}
