package questao6;

public class IngressoVip extends Ingresso {
	private double valorAdd;
	
	public IngressoVip(double valor, double valorAdd) {
		super(valor);
		this.valorAdd = valorAdd;
	}
	
	public String toString() {
		return "Valor do ingresso VIP é: "+(getValor()+valorAdd);
	}

	public double getValor() {
		return valorAdd+getValor();
	}

	public void setValorAdd(double valorAdd) {
		this.valorAdd = valorAdd;
	}
}
