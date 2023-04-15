package questoes;

import java.util.Scanner;

public class questao11 {
	public static int potencia(int base, int expo) {
		int potencia=1;
		for(int i=0;i<expo;i++) {
			potencia = potencia*base;
		}
		return potencia;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o a base");
			int base = ler.nextInt();
			System.out.println("Digite o expoente");
			int expo = ler.nextInt();
			int potencia = potencia(base,expo);
			System.out.println(potencia);
		}
	}

}
