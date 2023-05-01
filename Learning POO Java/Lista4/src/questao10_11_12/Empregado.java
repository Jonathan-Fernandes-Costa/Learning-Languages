package questao10_11_12;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	public Empregado(String nome, int idade, int codigo, float salario, float imposto) {
		super(nome, idade);
		codigoSetor = codigo;
		salarioBase = salario;
		this.imposto = imposto;
		
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	public float calcularSalario() {
		return salarioBase-imposto;
	}
}
