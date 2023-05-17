package robo;

public class Rainha extends Robo {
	public Rainha(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("R");
	}
	public void avancar(int casas) {
		if(casas<=4) {
			tiraRobo();
		setPosicaox(getPosicaox()-casas);
		setPosicaoy(getPosicaoy()+casas);
		atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas ");
		}
		
		
	}
	public void retroceder(int casas) {
		if(casas<=4) {
			tiraRobo();
			setPosicaox(getPosicaox()+casas);
			setPosicaoy(getPosicaoy()+casas);
			atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas ");
		}
		
		
	}
}
