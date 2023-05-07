package trabalho;

public class Tcc extends Publicacao{

	public Tcc(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super(titulo, ano, autor, quantidadeDisponivel);
		this.tipo="TCC";
	}

}
