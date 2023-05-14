package questao18;

public class Main {

	public static void main(String[] args) {
		Area a = new Area(5, 5);
		
		Robo r = new Robo(a);
		a.verificarSeTemRobo();
		a.retornarCasas();
		r.moverNorte(1);
		a.retornarCasas();
		r.moverLeste(2);
		a.retornarCasas();
		r.moverOeste(1);
		a.retornarCasas();
		r.moverSul(1);
		a.retornarCasas();
		r.moverNordeste(1);
		a.retornarCasas();
		r.moverSudoste(2);
		a.retornarCasas();
		r.moverNoroeste(1);
		a.retornarCasas();
		r.moverSudeste(2);
		a.retornarCasas();
		r.moverNorte(2);
		r.moverOeste(1);
		a.retornarCasas();
	}

}
