package questoes;

import java.util.Scanner;

public class questao7 {
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
	public static int[] copiaVetor(int []vetor) {
		int[] copia = new int[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
	        copia[i] = vetor[i];
	    }
		return copia;
	}
	public static boolean verificaordenacao(int []vetor) {
		int verifica = 0;
		int []copia = copiaVetor(vetor);
		copia = ordena(copia);
		for(int i=0; i<vetor.length; i++) {
			if(copia[i]!=vetor[i]) {
				verifica = 1;
			}
		}
		if(verifica == 0) {
			return true;
		}else {
			return false;
		}
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
			boolean ordenacao = verificaordenacao(vetor1);
			if(ordenacao) {
				System.out.println("Vetor ordenado");
			}else {
				System.out.println("Vetor não ordenando");
			}
		}
		

	}

}
