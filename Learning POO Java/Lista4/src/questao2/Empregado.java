package questao2;

public class Empregado {
	private String primeironome;
	private String segundonome;
	private double salario;
	
	public Empregado(String primeironome, String segundonome, double salario) {
		this.primeironome = primeironome;
		this.segundonome = segundonome;
		if(salario<0) {
			this.salario = 0;
		}else {
			this.salario = salario;
		}
		
	}

	public String getPrimeironome() {
		return primeironome;
	}

	public void setPrimeironome(String primeironome) {
		this.primeironome = primeironome;
	}

	public String getSegundonome() {
		return segundonome;
	}

	public void setSegundonome(String segundonome) {
		this.segundonome = segundonome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	

}