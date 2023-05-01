package questao9;

public class Triangulo extends Forma{
	private float base;
    private float altura;
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    public float calcularArea() {
        return (base * altura) / 2;
    }
    
    
    public void imprimirNome() {
        System.out.println("Triângulo, Área: "+calcularArea());
    }
}
