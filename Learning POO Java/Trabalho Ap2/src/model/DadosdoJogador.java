package model;

import java.util.ArrayList;

public class DadosdoJogador {
	private String nome;
	private int pontos;
	private int casaVazia;
	private int rodadasJogadas;
	private int quantAlunos;
	private int quantBugs;
	private int pontuacaoAndador = 0;
	private int pontuacaoCavalo = 0;
	private int pontuacaoRei = 0;
	
	public DadosdoJogador(String nome) {
		pontos = 0;
		rodadasJogadas =0;
		casaVazia =0;
		quantAlunos=0;
		quantBugs=0;
		this.nome = nome;
		
	}
	public DadosdoJogador(String nome, int rodadas, int celulasVazias, int pontuacao, int alunosResgatados, int bugsEncontrados, int pAndador, int pCavalos, int pRei) {
		this.nome = nome;
		this.rodadasJogadas = rodadas;
		this.casaVazia = celulasVazias;
		this.pontos = pontuacao;
		this.quantAlunos = alunosResgatados;
		this.quantBugs = bugsEncontrados;
		pontuacaoAndador = pAndador;
		pontuacaoCavalo = pCavalos;
		pontuacaoRei = pRei;
	}
	public void achouBug() {
		quantBugs++;
	}
	public void achouAluno() {
		quantAlunos++;
	}

	public String getNome() {
		return nome;
	}
	public void AdicionaPontosAndador() {
		pontuacaoAndador+=10;
	}
	public void AdicionaPontosCavalo() {
		pontuacaoCavalo+=10;
	}
	public void AdicionaPontosRei() {
		pontuacaoRei+=10;
	}
	public void RemovePontosAndador() {
		pontuacaoAndador-=15;
	}
	public void RemovePontosCavalo() {
		pontuacaoCavalo-=15;
	}
	public void RemovePontosRei() {
		pontuacaoRei-=15;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPontuacao() {
		return pontos;
	}
	

	public void atualizaPontuacao() {
		pontos = somaPontosDosRobos();
	}
	public int somaPontosDosRobos() {
		return pontuacaoAndador+pontuacaoCavalo+pontuacaoRei;
	}
	public String formataDados() {
		String Dados = "";
		
		Dados += getNome() + ";" + getRodadas() + ";" + getCelulasVazias() + ";" + getPontuacao() + 
				";" + getAlunosRegatados() + ";" + getBugsEncontrados() + ";" + pontuacaoAndador + ";" + pontuacaoCavalo + 
				";" + pontuacaoRei + "\n" ;
		
		return Dados;
	}
	public int getCelulasVazias() {
		return casaVazia;
	}


	public void naoAchouNada() {
		casaVazia++;
	}


	public int getRodadas() {
		return rodadasJogadas;
	}


	public void acresentaRodadas() {
		rodadasJogadas++;
	}	
	public int getAlunosRegatados() {
		return quantAlunos;
	}


	public void setAlunosRegatados(int alunosRegatados) {
		this.quantAlunos = alunosRegatados;
	}


	public int getBugsEncontrados() {
		return quantBugs;
	}


	public int getPontuacaoAndador() {
		return pontuacaoAndador;
	}
	public void setPontuacaoAndador(int pontuacaoAndador) {
		this.pontuacaoAndador = pontuacaoAndador;
	}
	public int getPontuacaoCavalo() {
		return pontuacaoCavalo;
	}
	public void setPontuacaoCavalo(int pontuacaoCavalo) {
		this.pontuacaoCavalo = pontuacaoCavalo;
	}
	public int getPontuacaoRei() {
		return pontuacaoRei;
	}
	public void setPontuacaoRei(int pontuacaoRei) {
		this.pontuacaoRei = pontuacaoRei;
	}
	public void setBugsEncontrados(int bugsEncontrados) {
		this.quantBugs = bugsEncontrados;
	}
	
	
}
