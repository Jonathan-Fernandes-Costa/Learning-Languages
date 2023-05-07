package trabalho;

public class Menu {

	public void print() {
		System.out.println("Bem vindo a Biblioteca TecProg");
		System.out.println("Menu: ");
		System.out.println("Digite >");
		System.out.println("1 - Sistema Biblioteca");
		System.out.println("2 - Cliente");
		System.out.println("3 - Sair do Programa");
	}
	public void printSistema() {
		System.out.println("Menu: ");
		System.out.println("Digite >");
		System.out.println("1 - Adicionar Cliente");
		System.out.println("2 - Adicionar Publicacão");
		System.out.println("3 - Fazer Emprestimo");
		System.out.println("4 - Listar Acervo");
		System.out.println("5 - Listar Clientes");
		System.out.println("6 - Listar Emprestimos");
		System.out.println("7 - Consultar emprestimos de um Cliente");
		System.out.println("8 - Buscar Publicação no Acervo");
		System.out.println("9 - Voltar");
	}
	
	public void printCliente() {
		System.out.println("Menu: ");
		System.out.println("Digite >");
		System.out.println("1 - Ver Historico");
		System.out.println("2 - Fazer Doação");
		System.out.println("3 - Voltar");
	}

}
