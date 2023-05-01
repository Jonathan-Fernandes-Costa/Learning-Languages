package questao9;

public class Circulo extends Forma{
	private float raio;
	
	public Circulo(float raio) {
		this.raio = raio;
	}

	
	public float calcularArea() {
		return 3.14f*(raio*raio);
	}

	
	public void imprimirNome() {
		System.out.println("Circulo, Area: "+calcularArea());
	}
	

}
