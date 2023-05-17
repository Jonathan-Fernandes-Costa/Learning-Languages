package robo;

public class Cavalo extends Robo{
	public Cavalo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		setPrint("C");
	}
	public void avancar(int casas) {
		if(casas<=2) {
			tiraRobo();
		setPosicaox(getPosicaox()+casas);
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
			setPosicaoy(getPosicaoy()-casas);
			atualizaPosicao();
		}else {
			System.out.println(" Número de casas inválidas ");
		}
		
		
	}
}
