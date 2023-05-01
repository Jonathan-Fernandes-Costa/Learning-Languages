package questao15;

public class Produto {
	private String nome;
	private float precoCusto;
	private float precoVenda;
	private float margemLucro;
	private float despesas;
	public Produto(String nome, float precoCusto, float precoVenda, float despesas) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.despesas = despesas;
	}
	public float calculoMargemLucro() {
		margemLucro =  ((precoVenda-(precoCusto+despesas))/precoVenda)*100;
		return margemLucro;
	}
	public String getNome() {
		return nome;
	}
}
