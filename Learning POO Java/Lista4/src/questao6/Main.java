package questao6;

public class Main {

	public static void main(String[] args) {
		IngressoVip teste = new IngressoVip(30, 10);
		Ingresso festa = new Ingresso(35);
		Evento forro = new Evento();
		
		forro.addIngresso(festa);
		forro.addIngresso(teste);
		forro.compraIngresso(0);
		forro.compraIngresso(0);
		forro.ingressosVendidos();
		forro.verificaVendidos();
	}

}
