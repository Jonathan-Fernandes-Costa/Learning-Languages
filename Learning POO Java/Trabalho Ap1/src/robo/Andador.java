package robo;

public class Andador extends Robo{

	
	public Andador(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("A");
	}


	public void avancar(int casas) {
		if(getPosicaox()-casas > 0) {
			tiraRobo();
			setPosicaox(getPosicaox()-casas);
			atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas robô vai para fora do plano ");
		}
		
	}
	
	public void retroceder(int casas) {
		if(getPlano().getTamanhox() >= getPosicaox()+casas) {
			tiraRobo();
			setPosicaox(getPosicaox()+casas);
			atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas robô vai para fora do plano ");
		}
		
	}

}
