package model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import controller.DadosdoJogador;

public class LerDados {
	
	private ArrayList<DadosdoJogador> listaJogadores;
	 
	public LerDados() {
		listaJogadores = new ArrayList<DadosdoJogador>();
	}

	public void lerDados(String diretorio) {
		try {
			
			FileReader Arquivo = new FileReader("src/banco/Relatorios.txt");
			BufferedReader Leitura = new BufferedReader(Arquivo);

			while (Leitura.ready()) {
				listaJogadores.add(separarDadosdoPlayer(Leitura.readLine()));
			}
			
			Leitura.close();
		} catch (Exception e) {
			
		}
	}

	private DadosdoJogador separarDadosdoPlayer(String linha) {
		
		String Dados[] = linha.split(";");
		
		int Rodadas = Integer.parseInt(Dados[1]);
		int Vazias = Integer.parseInt(Dados[2]);
		int Pontos = Integer.parseInt(Dados[3]);
		int Alunos = Integer.parseInt(Dados[4]);
		int Bugs = Integer.parseInt(Dados[5]);
		int Andador = Integer.parseInt(Dados[6]);
		int Cavalo = Integer.parseInt(Dados[7]);
		int Rei = Integer.parseInt(Dados[8]);
		
		DadosdoJogador JogadorAux = new DadosdoJogador(Dados[0], Rodadas, Vazias, Pontos, Alunos, Bugs, Andador, Cavalo, Rei);
		
		return JogadorAux;
	}
	
	public ArrayList<DadosdoJogador> getLista(){
		return listaJogadores;
	}
	
}