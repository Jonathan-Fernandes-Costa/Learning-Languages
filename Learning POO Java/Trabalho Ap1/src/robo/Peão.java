package robo;

public class Peão extends Robo{

	public Peão(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("P");
	}

	public void avancar(int casas) {
		tiraRobo();
		setPosicaoy(getPosicaoy()+casas);
		atualizaPosicao();
	}

	
	public void retroceder(int casas) {
		tiraRobo();
		setPosicaoy(getPosicaoy()-casas);
		atualizaPosicao();
	}

}
