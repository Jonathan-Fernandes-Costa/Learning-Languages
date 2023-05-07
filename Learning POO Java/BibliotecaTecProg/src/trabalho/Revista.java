package trabalho;

public class Revista extends Publicacao {

	public Revista(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super(titulo, ano, autor, quantidadeDisponivel);
		this.tipo="Revista";
	}
	public double darDesconto() {
		return 9.9;
	}

}
