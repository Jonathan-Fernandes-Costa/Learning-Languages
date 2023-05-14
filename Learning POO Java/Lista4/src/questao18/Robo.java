package questao18;


public class Robo implements MovimentaRobo{
	private Area area;
	private int numDeCasasAndadas;
	private int posicaoX;
	private int posicaoY;
	private Casa aux = null;
	
	
	public Robo(Area area) {
		this.area = area;
		posicaoX = area.getDimensaox()-area.getDimensaox()/2;
		posicaoY = area.getDimensaoy()-area.getDimensaoy()/2;	
		for (int i = 0; i < area.getCasas().size(); i++) {
			aux = area.getCasas().get(i);
			if (aux.getPosicaoX() == posicaoX && aux.getPosicaoY() == posicaoY) {
				aux.setRobo(this);
			}
		}
	}
	public void tiraRobo() {
		for (int i = 0; i < area.getCasas().size(); i++) {
			aux = area.getCasas().get(i);
			if (aux.getRobo() != null) {
				aux.setRobo(null);
			}
		}
	}
	public void atualizaPosicao(int casas) {
		for (int i = 0; i < area.getCasas().size(); i++) {
			aux = area.getCasas().get(i);
			if (aux.getPosicaoX() == posicaoX && aux.getPosicaoY() == posicaoY) {
				aux.setRobo(this);
			}
		}
		numDeCasasAndadas+=casas;
	}
	public void moverNorte(int casas) {
		System.out.println("Moveu pro Norte: "+casas+" casas");
		tiraRobo();
		posicaoX -=casas;
		atualizaPosicao(casas);
	}
	
	public void moverSul(int casas) {
		System.out.println("Moveu pro Sul: "+casas+" casas");
		tiraRobo();
		posicaoX +=casas;
		atualizaPosicao(casas);
		
	}
	public void moverLeste(int casas) {
		System.out.println("Moveu pro Leste: "+casas+" casas");
		tiraRobo();
		posicaoY += casas;
		atualizaPosicao(casas);
	}
	
	
	public void moverOeste(int casas) {
		System.out.println("Moveu pro Oeste: "+casas+" casas");
		tiraRobo();
		posicaoY -= casas;
		atualizaPosicao(casas);
		
	}
	
	public void moverNordeste(int casas) {
		System.out.println("Moveu pro Nordeste: "+casas+" casas");
		tiraRobo();
		posicaoY += casas;
		posicaoX -= casas;
		atualizaPosicao(casas);
		
	}

	public void moverSudeste(int casas) {
		System.out.println("Moveu pro Sudeste: "+casas+" casas");
		tiraRobo();
		posicaoY += casas;
		posicaoX += casas;
		atualizaPosicao(casas);
	}

	public void moverSudoste(int casas) {
		System.out.println("Moveu pro Sudoeste: "+casas+" casas");
		tiraRobo();
		posicaoY -= casas;
		posicaoX += casas;
		atualizaPosicao(casas);
		
		
	}
	
	public void moverNoroeste(int casas) {
		System.out.println("Moveu pro Noroeste: "+casas+" casas");
		tiraRobo();
		posicaoY -= casas;
		posicaoX -= casas;
		atualizaPosicao(casas);
		
		
	}
	
	
}
