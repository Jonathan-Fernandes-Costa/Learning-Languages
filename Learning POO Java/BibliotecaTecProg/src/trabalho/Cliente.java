package trabalho;

import java.util.ArrayList;

public abstract class Cliente implements ValidacaoEmprestimo{

	protected  int matricula;
	protected String nome;
	protected double tps;
	protected String tipo;
	protected int quantidadeEmprestimos;
	protected int doacao;
	protected ArrayList<Publicacao> historico;
	
	public Cliente(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.tps=0;
		historico = new ArrayList<Publicacao>();
	}
	public void fezEmprestimo() {
		quantidadeEmprestimos++;
	}
	public void devolveEmprestimo() {
		quantidadeEmprestimos--;
	}
	public boolean validatps() {
		if(tps % 50 == 0 && doacao<tps/50) {
			System.out.println("Precisa Fazer uma doação!");
			return false;
		}else {
			return true;
		}
	}
	public void fazDoacao() {
		doacao++;
	}
	public String print() {
		return matricula+";"+nome+";"+tps+";";
	}
	public void printHistorico() {
		System.out.println("Livros que ja foram pegos emprestados: ");
		for (int i = 0; i < historico.size(); i++) {
			System.out.println(historico.get(i).titulo);
		}
	}
	
}
