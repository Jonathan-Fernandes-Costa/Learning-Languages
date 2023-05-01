package questao7;

public class Empregado {
	private String nome;
	protected float salario;
	
	public String getNome() {
		return nome;
	}
	public Empregado(String nome, float salario) {
		this.nome =nome;
		this.salario = salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Empregado: "+nome+" Salário: "+salario;
	}
	
	
}
