package questao10_11_12;

public class Main {

	public static void main(String[] args) {
		Empregado jose = new Empregado("José", 20, 4321, 2000f, 30f);
		System.out.println(jose.calcularSalario());
		System.out.println(jose.getNome());
		
		Operario claudio = new Operario("Claudio", 23, 123123, 2000f, 45f, 200f,0.1f);
		System.out.println("Salário de claudio: "+claudio.calcularSalario());
		
		Vendedor vitor = new Vendedor("Vitor", 40, 24324234,1500f,20f,300f,0.1f);
		System.out.println("Salário do Vendedor Vitor: "+vitor.calcularSalario());
	}

}
