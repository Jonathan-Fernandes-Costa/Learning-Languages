package questoes;
import java.util.Scanner;
public class questao2 {
	public static int somatorio(int[]vetor) {
		int soma = 0;
		for(int i = 0; i<vetor.length;i++) {
			soma = soma+vetor[i];
		}
		return soma;
	}
	public static int media(int []vetor1, int []vetor2) {
		int soma1 = somatorio(vetor1);
		int soma2 = somatorio(vetor2);
		int somatotal = soma1+soma2;
		int tamanhovetores = vetor1.length+vetor2.length;
		System.out.println(tamanhovetores);
		int media = somatotal/tamanhovetores;
		return media;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
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
			int media = media(vetor1, vetor2);
			System.out.println("A media dos 2 vetores é: "+ media);
		}
		
	}

}
