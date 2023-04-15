package questoes;

import java.util.Scanner;

public class questao18 {
	public static double potencia(double base, int expo) {
		double potencia=1;
		for(int i=0;i<expo;i++) {
			potencia = potencia*base;
		}
		return potencia;
	}
	public static double jurosCompostos(double valorInicial, double taxaJuros, int numPeriodos) {
		double potencia = potencia(taxaJuros+1, numPeriodos);
	    double valorFinal = valorInicial * potencia;
	    return valorFinal;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o valor inicial: ");
			double inicial = ler.nextDouble();
			System.out.println("Digite a taxa de juros: ");
			double taxa = ler.nextDouble();
			System.out.println("Digite o periodo: ");
			int periodo = ler.nextInt();
			double juros = jurosCompostos(inicial, taxa, periodo);
			System.out.println("O juros composto é: "+ juros);
		}
	}

}
