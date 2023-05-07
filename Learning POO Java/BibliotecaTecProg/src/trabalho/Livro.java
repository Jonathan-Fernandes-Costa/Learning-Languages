package trabalho;

public class Livro extends Publicacao {

	public Livro(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super(titulo, ano, autor, quantidadeDisponivel);
		this.tipo="Livro";
	}
	public double darDesconto() {
		return 9;
	}

}
