package trabalho;

public class Artigo extends Publicacao {

	public Artigo(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super(titulo, ano, autor, quantidadeDisponivel);
		this.tipo="Artigo";
		
	}
	public double darDesconto() {
		return 5;
	}

	
}
