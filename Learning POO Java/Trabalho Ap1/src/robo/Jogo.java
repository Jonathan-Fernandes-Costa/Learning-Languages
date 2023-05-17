package robo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Jogo {
	private Plano plano;
	private Scanner ler;
	private String nomeJogador;
	private int bugs;
	private int alunos;
	private ArrayList<Robo> robos;

	public Jogo() {
		ler = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nomeJogador = ler.next();
		System.out.println("Digite o tamanho X e Y do Tabuleiro: ");
		plano = new Plano(ler.nextInt(), ler.nextInt());
		System.out.print(" Quantidade de Alunos- ");
		alunos = ler.nextInt();
		System.out.println("Quantidade de Bugs- ");
		bugs = ler.nextInt();
		// Instanciando os Robos
		robos.add(new Andador(0, "Andador", 0, 0, plano));
		robos.add(new Peão(1, "Peao", 0, 0, plano));
		robos.add(new Torre(2, "Torre", 0, 0, plano));
		robos.add(new Bispo(3, "Bispo", 0, 0, plano));
		robos.add(new Cavalo(4, "Cavalo", 0, 0, plano));
		robos.add(new Rei(5, "Rei", 0, 0, plano));
		robos.add(new Rainha(6, "Rainha", 0, 0, plano));
		rodaJogo();
	}

	public void rodaJogo() {
		plano.printPlano();
		solicitaMovimentos();
		plano.printPlano();
		
	}
	public void solicitaMovimentos() {
	int aux;
	for (int i = 0; i < 7; i++) {
		do {
			System.out.println("Digite o movimento para o Robo: " + robos.get(i).getNome());
			System.out.println("1-Avancar ou 2-Retroceder");
			aux = ler.nextInt();
			System.out.println("Digite o numero de casas: ");
			if (aux == 1) {
				robos.get(i).avancar(ler.nextInt());
			} else if (aux == 2) {
				robos.get(i).retroceder(ler.nextInt());
			}
		} while (aux != 1 || aux != 2);
	}}
}
