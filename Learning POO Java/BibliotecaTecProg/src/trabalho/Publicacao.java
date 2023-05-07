package trabalho;

public abstract class Publicacao {

	protected String titulo;
	protected int ano;
	protected String autor;
	protected int quantidadeDisponivel;
	protected String tipo;
	
	public Publicacao(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	public boolean verificaDiponivel() {
		if(quantidadeDisponivel>0) {
			return true;
		}else {
			return false;
		}
	}
	public double darDesconto() {
		return 10;
	}
	public String print() {
		return titulo+";"+ano+";"+autor+";"+quantidadeDisponivel;
	}
}
