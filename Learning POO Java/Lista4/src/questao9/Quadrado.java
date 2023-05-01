package questao9;

public class Quadrado extends Forma {
	private float lado;

	public Quadrado(float lado) {
		this.lado = lado;
	}

	public float calcularArea() {
		return lado*lado;
	}

	public void imprimirNome() {
		System.out.println("Quadrado, Área: "+calcularArea());
	}
}
