package robo;

public class Rainha extends Robo {
	public Rainha(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("R");
	}
	public void avancar(int casas) {
		if (getPlano().getTamanhoy() >= getPosicaoy() + casas && getPosicaox() - casas > 0) {
			if (casas <= 4) {
				tiraRobo();
				setPosicaox(getPosicaox() - casas);
				setPosicaoy(getPosicaoy() + casas);
				atualizaPosicao();
			} else {
				System.out.println(" Número de casas inválidas ");
			}
		} else {
			System.out.println(" Número de casas inválidas robô vai para fora do plano ");
		}

	}

	public void retroceder(int casas) {
		if(getPlano().getTamanhox() >= getPosicaox()+casas && getPlano().getTamanhoy() >= getPosicaoy()+casas) {
			if (casas <= 4) {
				tiraRobo();
				setPosicaox(getPosicaox() + casas);
				setPosicaoy(getPosicaoy() + casas);
				atualizaPosicao();
			} else {
				System.out.println(" Número de casas inválidas ");
			}
		}else {
			System.out.println(" Número de casas inválidas robô vai para fora do plano ");
		}
		

	}
}
