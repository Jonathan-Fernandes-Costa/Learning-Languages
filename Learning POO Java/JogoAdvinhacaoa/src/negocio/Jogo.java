package negocio;

import apresentacao.*;
import java.util.Random;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;
	private Random random;

	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		jogando = true;
		random = new Random();
		numeroEscolhido = random.nextInt(101);

	}

	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual é o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public int solicitarNumero() {
		String numero = tela.entradaDados("Informe sua tentativa de numero: "+(jogador.getNumeroTentativa()+1));
		return Integer.parseInt(numero);
	}

	public void jogadas() {
		do {
			verificarAcerto();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Numeros apostados: " + numeros);

	}

	public String verificarMenor(int numero) {
		if (numero < numeroEscolhido) {
			return "Tente um numero maior";
		} else {
			return "Tente um numero menor";
		}

	}

	public void verificarAcerto() {
		try {
			int numero = solicitarNumero();
			jogador.addNumero(numero);
			if (numero == numeroEscolhido) {
				tela.mesagem("Parabens voce acertou! numero de tentativas: " + jogador.getNumeroTentativa());
				jogando = false;
			} else {
				tela.mesagem("Você errou! "+verificarMenor(numero));
			}
		}catch (Exception e) {
			tela.mesagem("Erro! Numero inválido ");
		}
		
		
		
	}
}
