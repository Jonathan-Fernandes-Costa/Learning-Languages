package questoes;

import java.util.Scanner;

public class questao3 {
	public static int somatorio(int []vetor) {
		int soma =0;
		for(int i = 0; i<vetor.length;i++) {
			soma = soma+vetor[i];
		}
		return soma;
	}
	public static float mediaponderada(int []vetor1, int []vetor2) {
		float mediapon = 0;
		for(int i=0; i<vetor1.length; i++) {
			mediapon = mediapon + (vetor1[i]*vetor2[i]);
		}
		int soma = somatorio(vetor2);
		mediapon = mediapon/soma;
		return mediapon;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite a quantidade de notas");
			int tamanho = ler.nextInt();
			int []vetor1 = new int[tamanho];
			int []vetor2 = new int[tamanho];
			for(int i=0; i<vetor1.length;i++) {
				System.out.println("Digite a nota : "+(i+1));
				vetor1[i] = ler.nextInt();
			}
			for(int i=0; i<vetor2.length;i++) {
				System.out.println("Digite o peso da nota: "+(i+1));
				vetor2[i] = ler.nextInt();
			}
			float mediapon = mediaponderada(vetor1,vetor2);
			System.out.println("A media ponderada é: "+ mediapon);
		}
	}

}
