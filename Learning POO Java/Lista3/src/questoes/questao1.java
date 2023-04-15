package questoes;
import java.util.Scanner;
public class questao1 {
	public static int somatorio(int[]vetor) {
		int soma = 0;
		for(int i = 2; i<vetor.length-2;i++) {
			soma = soma+vetor[i];
		}
		return soma;
	}
	
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o tamanho do vetor");
			int tamanho = ler.nextInt();
			int []vetor = new int[tamanho];
			for(int i=0; i<vetor.length;i++) {
				System.out.println("Digite o elemento: "+(i+1));
				vetor[i] = ler.nextInt();
			}
			int soma = somatorio(vetor);
			System.out.println("A soma dos elementos, sem considerar os 2 primeiros e os 2 ultimos é: "+soma);
		}
	}

}
