package robo;

public class Bispo extends Robo{

	public Bispo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		
		setPrint("B");
	}


	
	public void avancar(int casas) {
		if(casas<=2) {
			tiraRobo();
		setPosicaox(getPosicaox()-casas);
		setPosicaoy(getPosicaoy()+casas);
		atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas ");
		}
		
		
	}
	public void retroceder(int casas) {
		if(casas<=2) {
			tiraRobo();
			setPosicaox(getPosicaox()+casas);
			setPosicaoy(getPosicaoy()+casas);
			atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas ");
		}
		
		
	}

}

//direcao=1 -> direita, direcao=2 -> esquerda/*
/* public void avancar(int casas, int direcao) {
	if(casas<=2) {
		if(direcao==1) {
			tiraRobo();
			setPosicaox(getPosicaox()-casas);
			setPosicaoy(getPosicaoy()+casas);
			atualizaPosicao();
		}else if(direcao==2) {
			tiraRobo();
			setPosicaox(getPosicaox()-casas);
			setPosicaoy(getPosicaoy()-casas);
			atualizaPosicao();
		}
		
	}else {
		System.out.println(" Número de casas inválidas ");
	}
}


public void retroceder(int casas, int direcao) {
	if(casas<=2) {
		if(direcao==1) {
			tiraRobo();
			setPosicaox(getPosicaox()+casas);
			setPosicaoy(getPosicaoy()+casas);
			atualizaPosicao();
		}else if(direcao==2) {
			tiraRobo();
			setPosicaox(getPosicaox()+casas);
			setPosicaoy(getPosicaoy()-casas);
			atualizaPosicao();
		}
	}else {
		System.out.println(" Número de casas inválidas ");
	}
	
}*/