package controller;

import java.io.FileWriter;

public class EscreverDados {
	
	public void escreverDados(String mensagem) {
		try {

			FileWriter Arquivo = new FileWriter("src/banco/Relatorios.txt");
			Arquivo.write(mensagem);
			Arquivo.close();

		} catch (Exception e) {
			
		}
	}
	
}
