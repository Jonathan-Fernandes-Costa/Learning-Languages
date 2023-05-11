package questao17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		JogoDaVelha jogo = new JogoDaVelha();
		Scanner s = new Scanner(System.in);
		int x;
		int y;
		boolean verifica;
		int fim = 2;
		System.out.println("Legenda: Jogador1 = X, Jogador2 = O");
		System.out.println("   |JOGO DA VELHA|");
		System.out.println();
		jogo.printGrade();
		do {
			do {
				System.out.println("Jogador 1:");
				System.out.println("Digite a posição X que quer jogar: ");
				x = s.nextInt() - 1;
				System.out.println("Digite a posição Y que quer jogar: ");
				y = s.nextInt() - 1;
				verifica = jogo.jogada(1, x, y);
				jogo.printGrade();
				fim = jogo.verificaVitoria();
			} while (verifica);
			if (fim == 2) {
				do {
					System.out.println("Jogador 2:");
					System.out.println("Digite a posição X que quer jogar: ");
					x = s.nextInt() - 1;
					System.out.println("Digite a posição Y que quer jogar: ");
					y = s.nextInt() - 1;
					verifica = jogo.jogada(2, x, y);
					jogo.printGrade();
					fim = jogo.verificaVitoria();
				} while (verifica);
			} else if (fim == 1) {
				System.out.println("Jogador 1 VENCEU!");
			}

		} while (fim == 2);
		if (fim == 1) {
			System.out.println("Jogador 2 VENCEU!");
		}
		if (fim == 3) {
			System.out.println("Deu EMPATE");
		}
	}

}
