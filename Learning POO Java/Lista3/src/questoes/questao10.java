package questoes;

import java.util.Scanner;

public class questao10 {
	public static boolean verificaIgualdade(int []vetor1, int []vetor2) {
		int verifica =0;
		for(int i=0; i<vetor1.length; i++) {
			if(vetor1[i]!=vetor2[i]) {
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
		try (//ja tinha feito a logica antes na questao de verificar a ordenação, entao so fiz algumas mudanças
		Scanner ler = new Scanner(System.in)) {
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
			boolean igualdade = verificaIgualdade(vetor1, vetor2);
			if(igualdade) {
				System.out.println("Vetores iguais");
			}else {
				System.out.println("Vetores diferentes");
			}
		}
	}

}
