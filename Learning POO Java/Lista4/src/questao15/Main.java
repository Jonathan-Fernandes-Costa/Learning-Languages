package questao15;

public class Main {

	public static void main(String[] args) {
		Produto carro = new Produto("Carro", 20000, 25000, 2000);
		System.out.println(carro.calculoMargemLucro()+"%");
	}

}
