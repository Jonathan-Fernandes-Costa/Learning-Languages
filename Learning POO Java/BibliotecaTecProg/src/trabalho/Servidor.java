package trabalho;

public class Servidor extends Cliente {

	public Servidor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Servidor";
		
	}
	public boolean verificaSePodeEmprestimo() {
		if(quantidadeEmprestimos<7) {
			return true;
		}else {
			return false;
		}
	}
	public int verificarDias() {
		return 15;
	}
	public void computaTp(Publicacao publicacao) {
		tps += 15;
	}
}
