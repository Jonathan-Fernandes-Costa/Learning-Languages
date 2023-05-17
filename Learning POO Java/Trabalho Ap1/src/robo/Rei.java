package robo;

public class Rei extends Robo{
	public Rei(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("K");
	}
	public void avancar(int casas) {
		if(casas<=4) {
			tiraRobo();
		setPosicaox(getPosicaox()+casas);
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
			setPosicaoy(getPosicaoy()-casas);
			atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas ");
		}
		
		
	}
}