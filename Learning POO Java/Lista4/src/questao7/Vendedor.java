package questao7;

public class Vendedor extends Empregado{
	private float percomissao;
	private float comissao;
	private float total;
	public Vendedor(String nome, float salario, float comissao) {
		super(nome, salario);
		this.percomissao= comissao;
		total = salario;
	}
	public void venda(float valor) {
		comissao = comissao+(valor*percomissao);
		total = total+comissao;
	}
	public float calculaSalario() {
		return getSalario() + comissao;	
	}
	public String toString() {
		return "Vendedor: "+getNome()+" Salário sem comissão: "+getSalario()+" Salário com comissão: "+total+" Percentual de comissão: "+percomissao;
	}
}
