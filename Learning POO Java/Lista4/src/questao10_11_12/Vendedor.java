package questao10_11_12;

public class Vendedor extends Empregado{
	private float valorVendas;
	private float comissao;
	public float vendas;
	public Vendedor(String nome, int idade, int codigo, float salario, float imposto, float vendas, float comissao) {
		super(nome, idade, codigo, salario, imposto);
		valorVendas = vendas;
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		return(getSalarioBase()-getImposto())+valorVendas*comissao;
	}
}
