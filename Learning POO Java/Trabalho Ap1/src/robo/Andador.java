package robo;

public class Andador extends Robo{

	
	public Andador(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("A");
	}


	public void avancar(int casas) {
		tiraRobo();
		setPosicaox(getPosicaox()-casas);
		atualizaPosicao();
	}
	
	public void retroceder(int casas) {
		tiraRobo();
		setPosicaox(getPosicaox()+casas);
		atualizaPosicao();
	}

}
