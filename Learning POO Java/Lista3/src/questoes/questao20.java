package questoes;

import java.util.Scanner;

public class questao20 {
	public static int[] vetorDecresendo(int n) {
	    int[] vet = new int[n];
	    for (int i = 0; i < n; i++) {
	        vet[i] = n - i;
	    }
	    return vet;
	}
	public static void main(String[] args) {
		try (//não entendi muito bem o enunciado, mas eis aqui minha resolução
		Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o numero: ");
			int num = ler.nextInt();
			int []vetor = vetorDecresendo(num);
			System.out.println("O vetor criado é: ");
			for(int i=0; i<vetor.length;i++) {
				System.out.print(vetor[i]);
			}
		}
	}

}
