package questao18;

public class Casa {
	private int posicaoX;
	private int posicaoY;
	private int id;
	private Robo robo;
	public Casa(int id, int x , int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		robo =null;
	}
	public int getPosicaoX() {
		return posicaoX;
	}
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	public int getPosicaoY() {
		return posicaoY;
	}
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	public Robo getRobo() {
		return robo;
	}
	public void setRobo(Robo robo) {
		this.robo = robo;
	}
	public String imprimir() {
		if(robo==null) {
			return " * ";
		}else {
			return " A ";
		}
	
}}
