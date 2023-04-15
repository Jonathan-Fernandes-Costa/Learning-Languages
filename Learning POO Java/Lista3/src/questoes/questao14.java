package questoes;

import java.util.Scanner;

public class questao14 {
	public static int[] removeElemento(int[] vetor, int elemento) {
	    int cont = 0;
	    for (int i = 0; i < vetor.length; i++) {
	        if (vetor[i] == elemento) {
	            cont++;
	        }
	    }
	    int[] vetorResultado = new int[vetor.length - cont];
	    int j = 0;
	    for (int i = 0; i < vetor.length; i++) {
	        if (vetor[i] != elemento) {
	            vetorResultado[j] = vetor[i];
	            j++;
	        }
	    }
	    return vetorResultado;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o tamanho do vetor");
			int tamanho = ler.nextInt();
			int []vetor1 = new int[tamanho];
			for(int i=0; i<vetor1.length;i++) {
				System.out.println("Digite o elemento: "+(i+1)+" do vetor ");
				vetor1[i] = ler.nextInt();
			}
			System.out.println("Digite o elemento a ser removido: ");
			int elemento = ler.nextInt();
			int []vetorCorrigido = removeElemento(vetor1, elemento);
			System.out.println("Vetor sem o elemento digitado: ");
			for(int i=0; i<vetorCorrigido.length;i++) {
				System.out.print(vetorCorrigido[i]);
			}
		}
	}

}
