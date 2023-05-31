package robo;

import java.util.ArrayList;

public abstract class Robo implements MovimentoRobo {

	private int id;

	private String nome;
	private int posicaox;
	private int posicaoy;
	private Plano plano;
	private int pontuacao;
	private String print;
	private ArrayList<String> posicoesVisitadas;
	private int alunosEncontrados;
	private int bugsEncontrados;

	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		this.id = id;
		this.nome = nome;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.plano = plano;
		posicoesVisitadas = new ArrayList<String>();
		alunosEncontrados = 0;
		bugsEncontrados = 0;
		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.getPosicaoX() == posicaox && aux.getPosicaoY() == posicaoy) {
				aux.getRobos().add(this);
			}
		}
	}

	public void tiraRobo() {
		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.getPosicaoX() == posicaox && aux.getPosicaoY() == posicaoy) {
				aux.apagaRobo(this);
				aux.setPrint(" = ");
			}
		}
	}

	public void atualizaPosicao() {
		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.getPosicaoX() == posicaox && aux.getPosicaoY() == posicaoy) {
				aux.getRobos().add(this);
				posicoesVisitadas.add("(X: " + posicaox + " Y: " + posicaoy+")");
			}
		}
	}

	public void achouAluno() {
		pontuacao += 10;
		alunosEncontrados++;
	}

	public void achouBug() {
		pontuacao -= 15;
		bugsEncontrados++;
	}

	public String relatorio() {
		return nome+" Pontuação: "+pontuacao+" Células visitadas: "+posicoes()+" Alunos regatados: "+alunosEncontrados+" Bugs encontrados: "+bugsEncontrados;
	}

	public String posicoes() {
		StringBuilder string = new StringBuilder();
		for (String elemento : posicoesVisitadas) {
			string.append(elemento).append(", ");
		}
		if (string.length() > 0) {
			string.setLength(string.length() - 2);
		}
		String stringFinal = string.toString();
		return stringFinal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public String getPrint() {
		return " " + print + " ";
	}

	public void setPrint(String print) {
		this.print = print;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

}
