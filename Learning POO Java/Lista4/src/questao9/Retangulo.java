package questao9;

public class Retangulo extends Forma{
	private float altura;
	private float largura;
	
	public Retangulo(float alt, float larg) {
		altura = alt;
		largura = larg;
	}

	
	public float calcularArea() {
		return altura*largura;
	}

	
	public void imprimirNome() {
		System.out.println("Retângulo, Área: "+calcularArea());
		
	}
	

}
