package trabalho;

public class Aluno extends Cliente {

	public Aluno(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Aluno";
		quantidadeEmprestimos=0;
	}
	
	public boolean verificaSePodeEmprestimo() {
		if(quantidadeEmprestimos<5) {
			return true;
		}else {
			return false;
		}
	}
	public int verificarDias() {
		return 10;
	}
	public void computaTp(Publicacao publicacao) {
		tps += publicacao.darDesconto();
	}

	

}
