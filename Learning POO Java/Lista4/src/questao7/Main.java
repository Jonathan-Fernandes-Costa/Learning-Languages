package questao7;

public class Main {

	public static void main(String[] args) {
		Empregado mateus = new Empregado("Mateus", 1000);
		Gerente carlos  = new  Gerente("Carlos", 3000, "Sobral");
		Vendedor matias = new Vendedor("Matias", 1200, 0.1f);
		matias.venda(1000);
		System.out.println(mateus.toString());
		System.out.println(carlos.toString());
		System.out.println(matias.toString());	}

}
