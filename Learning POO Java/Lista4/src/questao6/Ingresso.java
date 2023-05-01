package questao6;

public class Ingresso {
	private double valor;
	private boolean vendido=false;
	
	public boolean isVendido() {
		return vendido;
	}
	public Ingresso(double valor) {
		this.valor = valor;
	}
	public String toString() {
		return "O valor do ingresso é: "+ valor;
	}
	public void vender() {
		this.vendido = true;
	}
	public double getValor() {
		return valor;
	}
}
