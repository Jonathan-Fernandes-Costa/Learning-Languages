package trabalho;

public interface ValidacaoEmprestimo {
	
	public int verificarDias();
	public void fezEmprestimo();
	public void devolveEmprestimo();
	public boolean verificaSePodeEmprestimo();
	public boolean validatps();
	public void computaTp(Publicacao publicacao);
}
