package questao10_11_12;

public class Operario extends Empregado{
	private float valorProducao;
	private float comissao;
	public Operario(String nome, int idade, int codigo, float salario, float imposto, float  valorprod, float comissao) {
		super(nome, idade, codigo, salario, imposto);
		this.valorProducao = valorprod;
		this.comissao = comissao;
		
	}
	public float calcularSalario(){
		return (getSalarioBase()-getImposto()) + valorProducao*comissao;
	}
}
