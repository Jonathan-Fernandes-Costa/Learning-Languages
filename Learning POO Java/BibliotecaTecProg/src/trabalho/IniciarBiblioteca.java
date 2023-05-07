package trabalho;

import java.util.Scanner;

public class IniciarBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca bib = new Biblioteca();
		
		Aluno jonathan = new Aluno(538416, "Jonathan");
		Professor fisher = new Professor(31313, "Jonatas");
		Artigo biblioteca = new Artigo("Que trabalho grande", 2023, "Jonathan",100);
		bib.addCliente(fisher);
		bib.addCliente(jonathan);
		bib.addPublicacao(biblioteca);
		int sistema;
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		do {
			menu.print();
		sistema = s.nextInt();
		if (sistema == 1) {
			int escolha;
			do {
				escolha = 0;
				menu.printSistema();
				escolha = s.nextInt();
				verificaEscolhaSitema(escolha, bib);
			} while (escolha != 9);
		} else if(sistema ==2){
			int escolha;
			int aux;
			System.out.println("Escolha qual cliente você é: ");
			bib.todosClientes();
			aux= s.nextInt();
			
			do {
				escolha = 0;
				menu.printCliente();
				escolha = s.nextInt();
				verificaEscolhaCliente(escolha, bib.getClientes().get(aux-1), bib);
			} while (escolha != 3);
		}
		}while(sistema!=3);
		System.out.println("Biblioteca Fechada");
	}


	public static void verificaEscolhaSitema(int escolha, Biblioteca bib) {
		Scanner s = new Scanner(System.in);
		if (escolha == 1) {
			int aux = 0;
			System.out.println("Digite o tipo de Cliente:");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Servidor");
			aux = s.nextInt();
			if (aux == 1) {
				System.out.println("Digite a matricula e o nome do Aluno");
				bib.addCliente(new Aluno(s.nextInt(), s.next()));
			}
			if (aux == 2) {
				System.out.println("Digite a matricula e o nome do Professor");
				bib.addCliente(new Professor(s.nextInt(), s.next()));
			}
			if (aux == 3) {
				System.out.println("Digite a matricula e o nome do Servidor");
				bib.addCliente(new Servidor(s.nextInt(), s.next()));
			}
		}
		if (escolha == 2) {
			int aux = 0;
			System.out.println("Digite o tipo da Publicação:");
			System.out.println("1 - Livro");
			System.out.println("2 - Artigo");
			System.out.println("3 - Revista");
			System.out.println("4 - TCC");
			aux = s.nextInt();
			System.out.println("Digite o titulo, ano, autor e quantidade disponivel:");
			if (aux == 1) {
				bib.addPublicacao(new Livro(s.next(), s.nextInt(), s.next(), s.nextInt()));
			}
			if (aux == 2) {
				bib.addPublicacao(new Artigo(s.next(), s.nextInt(), s.next(), s.nextInt()));
			}
			if (aux == 3) {
				bib.addPublicacao(new Revista(s.next(), s.nextInt(), s.next(), s.nextInt()));
			}
			if (aux == 4) {
				bib.addPublicacao(new Tcc(s.next(), s.nextInt(), s.next(), s.nextInt()));
			}
		}
		if (escolha == 3) {
			int aux = 0;
			int aux2 = 0;
			System.out.println("Escolha o cliente que vai pegar emprestado:");
			bib.todosClientes();
			aux = s.nextInt();
			System.out.println("Escolha a publicação que vai ser emprestada:");
			bib.todosAcervo();
			aux2 = s.nextInt();
			bib.addEmprestimo(new Emprestimo(bib.getClientes().get(aux-1), bib.getPublicacao().get(aux2-1)));
		}
		if (escolha == 4) {
			bib.listarAcervo();
		}
		if (escolha == 5) {
			bib.listarClientes();
		}
		if (escolha == 6) {
			bib.gerarRelatorio();
		}
		if (escolha == 7) {
			int aux = 0;
			System.out.println("Digite a matricula do cliente");
			aux = s.nextInt();
			bib.consultaEmprestimos(aux);
		}
		if (escolha == 8) {
			String aux = "";
			System.out.println("Digite o nome da publicação");
			aux = s.next();
			if (bib.pesquisaPublicacao(aux)) {
				System.out.println("Publicação presente no Acervo");
			}else {
				System.out.println("Publicação não presente");
			}

		}
	}

	public static void verificaEscolhaCliente(int escolha, Cliente cliente, Biblioteca bib) {
		Scanner s = new Scanner(System.in);
		if (escolha == 1) {
			System.out.println("Historico: ");
			cliente.printHistorico();
		}
		if (escolha == 2) {
			int aux = 0;
			System.out.println("Digite o tipo da Publicação:");
			System.out.println("1 - Livro");
			System.out.println("2 - Artigo");
			System.out.println("3 - Revista");
			System.out.println("4 - TCC");
			aux = s.nextInt();
			System.out.println("Digite o titulo, ano, autor e quantidade disponivel:");
			if (aux == 1) {
				bib.addPublicacao(new Livro(s.next(), s.nextInt(), s.next(), s.nextInt()));
			}
			if (aux == 2) {
				bib.addPublicacao(new Artigo(s.next(), s.nextInt(), s.next(), s.nextInt()));
			}
			if (aux == 3) {
				bib.addPublicacao(new Revista(s.next(), s.nextInt(), s.next(), s.nextInt()));
			}
			if (aux == 4) {
				bib.addPublicacao(new Tcc(s.next(), s.nextInt(), s.next(), s.nextInt()));
			}
			cliente.fazDoacao();
		}
	}

}
