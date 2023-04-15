package questoes;

import java.util.Scanner;

public class questao13 {
	public static int[] buscaOcorrencia(int[] vetor1, int[]vetor2) {
		int []ocorrencias = new int[vetor1.length];
		for(int i=0;i<vetor1.length;i++) {
			for(int j=0;j<vetor2.length;j++) {
				if(vetor1[i] == vetor2[j]) {
					ocorrencias[i]=vetor1[i];
				}
			}
		}
		return ocorrencias;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o tamanho dos vetores, programa não aceita valores <= 0");
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
			int []ocorrencias = buscaOcorrencia(vetor1, vetor2);
			System.out.println("Ocorrencias: ");
			for(int i=0; i<ocorrencias.length;i++) {
				if(ocorrencias[i]>0) {
					System.out.print(ocorrencias[i]);
				}
				
			}
		}
		
	}

}
