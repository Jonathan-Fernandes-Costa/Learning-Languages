package controllers;

import java.io.FileWriter;

public class EscreverDados {
	
	public void escreverDados(String mensagem) {

		try {
			//Tentando escrever os dados que foi passada e fechando o arquivo
			FileWriter arquivo = new FileWriter("dados/Alunos.txt");
			arquivo.write(mensagem);
			arquivo.close();

		} catch (Exception e) {
			
		}
	}
}
