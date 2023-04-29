package questao2;

public class Main {

	public static void main(String[] args) {
		Empregado claudio = new Empregado("claudio", "porto", 1000);
		Empregado jose = new Empregado("jose", "ferreira", 2000);
		
		System.out.println("Salário anual de Claudio: "+ claudio.getSalario()*12);
		System.out.println("Salário anual de José: "+ jose.getSalario()*12);
		
		claudio.setSalario(claudio.getSalario()+claudio.getSalario()*0.1);
		jose.setSalario(jose.getSalario()+jose.getSalario()*0.1);
		
		System.out.println("Salario após o reajuste de 10%: ");
		System.out.println("Salário anual de Claudio: "+ claudio.getSalario()*12);
		System.out.println("Salário anual de José: "+ jose.getSalario()*12);
	}

}
