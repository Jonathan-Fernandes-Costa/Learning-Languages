package robo;

public class Bispo extends Robo {

	public Bispo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);

		setPrint("B");
	}

	public void avancar(int casas) {
		if (getPlano().getTamanhoy() >= getPosicaoy() + casas && getPosicaox() - casas > 0) {
			if (casas <= 2) {
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
			if (casas <= 2) {
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

//direcao=1 -> direita, direcao=2 -> esquerda/*
/*
 * public void avancar(int casas, int direcao) { if(casas<=2) { if(direcao==1) {
 * tiraRobo(); setPosicaox(getPosicaox()-casas);
 * setPosicaoy(getPosicaoy()+casas); atualizaPosicao(); }else if(direcao==2) {
 * tiraRobo(); setPosicaox(getPosicaox()-casas);
 * setPosicaoy(getPosicaoy()-casas); atualizaPosicao(); }
 * 
 * }else { System.out.println(" Número de casas inválidas "); } }
 * 
 * 
 * public void retroceder(int casas, int direcao) { if(casas<=2) {
 * if(direcao==1) { tiraRobo(); setPosicaox(getPosicaox()+casas);
 * setPosicaoy(getPosicaoy()+casas); atualizaPosicao(); }else if(direcao==2) {
 * tiraRobo(); setPosicaox(getPosicaox()+casas);
 * setPosicaoy(getPosicaoy()-casas); atualizaPosicao(); } }else {
 * System.out.println(" Número de casas inválidas "); }
 * 
 * }
 */