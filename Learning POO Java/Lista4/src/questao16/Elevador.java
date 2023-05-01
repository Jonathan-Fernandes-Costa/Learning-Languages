package questao16;

public class Elevador {
	private int andarAtual=0;
	private int totalAndares;
	private int capacidade;
	private int pessoas=0;
	public Elevador(int totalAndares, int capacidade) {
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
		
	}
	
	public void entra() {
		if(pessoas<capacidade) {
			pessoas++;
		}
	}
	public void sai() {
		if(pessoas>0) {
			pessoas--;
		}
	}
	public void sobe() {
		if(andarAtual<totalAndares) {
			andarAtual++;
		}
	}
	public void desce() {
		if(andarAtual>0) {
			andarAtual--;
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	
}
