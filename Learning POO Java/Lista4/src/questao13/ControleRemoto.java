package questao13;

public class ControleRemoto {
	//Alguns atributos que estao aqui deveriam estar numa classe TV, mas como a questão não
	//pediu pra fazer essa classe então coloquei os atributos aqui mesmo;
	private boolean on_off=false;
	private int volume;
	private int canal;
	
	
	public ControleRemoto(boolean on_off, int volume, int canal) {
		this.on_off = on_off;
		this.volume = volume;
		this.canal = canal;
	}
	public boolean Liga_Desliga() {
		return !on_off;
	}
	public void aumentaVolume() {
		volume++;
	}
	public void diminuiVolume() {
		volume--;
	}
	public void aumentaCanal() {
		canal++;
	}
	public void diminiuCanal() {
		canal--;
	}
	public void mudaCanal(int num) {
		canal = num;
	}
	public void mute() {
		volume=0;
	}
	public int getVolume() {
		return volume;
	}
	public int getCanal() {
		return canal;
	}
	
}
