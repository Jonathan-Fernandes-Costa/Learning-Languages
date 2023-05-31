package robo;

public class Peão extends Robo{

	public Peão(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("P");
	}

	public void avancar(int casas) {
		if(getPlano().getTamanhox() >= getPosicaox()+casas) {
			if(casas==1) {
				tiraRobo();
				setPosicaoy(getPosicaoy()+casas);
				atualizaPosicao();
			}else {
				System.out.println("Número de casas inválidas!");
			}
		}else {
			System.out.println("Número de casas inválidas robô vai para fora do plano");
		}
		
	}

	
	public void retroceder(int casas) {
		if(getPosicaoy()-casas>0) {
			if(casas==1) {
				tiraRobo();
				setPosicaoy(getPosicaoy()-casas);
				atualizaPosicao();
				
			}else {
				System.out.println("Número de casas inválidas");
			}
		}else {
			System.out.println("Número de casas inválidas robô vai para fora do plano");
		}
	}

}
