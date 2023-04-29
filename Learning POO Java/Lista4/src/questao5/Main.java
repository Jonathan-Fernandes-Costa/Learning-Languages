package questao5;

public class Main {

	public static void main(String[] args) {
		Cliente jose = new Cliente("José", "Contatos de Sobral", "Minha Agendinha");
		Contato teste = new Contato(5000,"abrao", "isaaa");
		Contato teste2 = new Contato(6000,"teste", "irraaa");
		jose.adicionarContato(teste);
		jose.adicionarContato(teste2);
		System.out.println("Contatos da Agenda de Jose: ");
		jose.mostrarContatos();
		jose.removerContato(5000);
		System.out.println("Contatos da Agenda de Jose: " );
		jose.mostrarContatos();
	}

}
