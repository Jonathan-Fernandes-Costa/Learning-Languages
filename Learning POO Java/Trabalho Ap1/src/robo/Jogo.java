package robo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
	private Plano plano;
	private Scanner ler;
	private String nomeJogador;
	private int bugs;
	private int alunos;
	private ArrayList<Robo> robos;
	private Random random;
	public Jogo() {
		ler = new Scanner(System.in);
		random = new Random();
		System.out.println("Digite seu nome: ");
		nomeJogador = ler.next();
		System.out.println("Digite o tamanho X e Y do Tabuleiro: ");
		plano = new Plano(ler.nextInt(), ler.nextInt());
		try {
			solicitaAlunosEBugs();
		}catch (Exception e) {
			System.out.println("Digite valores inteiros!");
			solicitaAlunosEBugs();
		}
		geraAlunosEBugs();
		
		// Instanciando os Robos
		robos = new ArrayList<Robo>();
		robos.add(new Andador(0, "Andador", 1, 1, plano));
		robos.add(new Peão(1, "Peao", 1, 1, plano));
		robos.add(new Torre(2, "Torre", 1, 1, plano));
		robos.add(new Bispo(3, "Bispo", 1, 1, plano));
		robos.add(new Cavalo(4, "Cavalo", 1, 1, plano));
		robos.add(new Rei(5, "Rei", 1, 1, plano));
		robos.add(new Rainha(6, "Rainha", 1, 1, plano));
		rodaJogo();
	}
	public void rodaJogo() {
		plano.printPlano();
		if(solicitaMovimentos()) {
			verificaAcertosEErros();
			plano.apagaAlunoEncontrado();
			printTabelaRodada();
			rodaJogo();
		}else {
			printTabelaFinal();
		}

	}
	public boolean solicitaMovimentos() {
		int aux;
		int casas;
		System.out.println("Digite 1 para continuar ou 2 para sair do jogo! ");
		if (ler.nextInt() == 2 || verificaAlunos()) {
			return false;
		} else {
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
				} while (aux != 1 && aux != 2);
				
			}
			return true;
			
		}
	}
	public boolean verificaAlunos() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if(plano.listaCelulas.get(i).getAlunoEbug() == 1) {
				return false;
			}
		}
		return true;
	}
	public void verificaAcertosEErros() {
		for (int i = 0; i < robos.size(); i++) {
			int result = plano.verificaRobo(robos.get(i));
			if(result == 1) {
				System.out.println("O Robo "+ robos.get(i).getNome() +" achou um aluno e ganhou 10 pontos");
			}else if( result == 2) {
				System.out.println("O Robo "+ robos.get(i).getNome() +" foi atacado por um bug e perdeu 15 pontos");
			}
		}
		
	}
	public void printTabelaRodada() {
		for (int i = 0; i < robos.size(); i++) {
			System.out.println("Robo "+ robos.get(i).getNome()+", Pontuação: "+robos.get(i).getPontuacao());
		}
	}
	public void printTabelaFinal() {
		for (int i = 0; i < robos.size(); i++) {
			System.out.println(robos.get(i).relatorio());
		}
		System.out.println("");
		printVencedor();
	}
	public void printVencedor() {
		Robo vencedor = robos.get(0);
		ArrayList<Robo> vencedores = new ArrayList<Robo>();
		for (int i = 0; i < robos.size(); i++) {
			 if (robos.get(i).getPontuacao() > vencedor.getPontuacao()) {
	                vencedor = robos.get(i);
	                vencedores.clear();
	                vencedores.add(vencedor);
	            } else if (robos.get(i).getPontuacao() == vencedor.getPontuacao()) {
	                vencedores.add(robos.get(i));
	            }
		}
		if(vencedores.size()==1) {
			System.out.println("Robo vencedor: "+vencedores.get(0).getNome()+", Jogador: "+nomeJogador);
		}else {
			for(Robo robo : vencedores) {
				System.out.println("Robores vencedores: "+robo.getNome());
			}
			System.out.println("Jogador: "+nomeJogador);
			
		}
	}
	public void solicitaAlunosEBugs() {
		int aux;
		do {
			aux=0;
			System.out.print("Quantidade de Alunos- ");
			alunos = ler.nextInt();
			System.out.println("Quantidade de Bugs- ");
			bugs = ler.nextInt();
			if((alunos+bugs)>(plano.getTamanho()/2)) {
				System.out.println("Muitos alunos e bugs, diminua a quantidade!");
				aux=1;
			}
		}while(aux==1);
	}
	public void geraAlunosEBugs() {
		for (int i = 0; i < alunos; i++) {
			if(plano.listaCelulas.get(random.nextInt(plano.getTamanho())).getAlunoEbug() == 0) {
				plano.listaCelulas.get(random.nextInt(plano.getTamanho())).setAlunoEbug(1);;
			}else {
				i = i-1;
			}
		}
		for (int i = 0; i < bugs; i++) {
			if(plano.listaCelulas.get(random.nextInt(plano.getTamanho())).getAlunoEbug() == 0) {
				plano.listaCelulas.get(random.nextInt(plano.getTamanho())).setAlunoEbug(2);;
			}else {
				i = i-1;
			}
		}
	}
}
