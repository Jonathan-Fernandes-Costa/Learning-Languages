package trabalho;

public class Professor extends Cliente {

	public Professor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Professor";
	}
	public boolean verificaSePodeEmprestimo() {
		if(quantidadeEmprestimos<10) {
			return true;
		}else {
			return false;
		}
	}
	public int verificarDias() {
		return 20;
	}
	public void computaTp(Publicacao publicacao) {
		tps += 25;
	}

}
