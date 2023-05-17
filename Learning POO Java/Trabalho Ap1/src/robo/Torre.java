package robo;

public class Torre extends Robo{

	public Torre(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("T");
	}

	public void avancar(int casas) {
		if(casas<=2) {
			tiraRobo();
			setPosicaox(getPosicaox()-casas);
			atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas ");
		}
		
	}

	
	public void retroceder(int casas) {
		if(casas<=2) {
			tiraRobo();
			setPosicaox(getPosicaox()+casas);
			atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas ");
		}
		
	}

}
