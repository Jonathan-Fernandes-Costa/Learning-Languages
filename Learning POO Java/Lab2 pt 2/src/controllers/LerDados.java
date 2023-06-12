package controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import back.Aluno;

public class LerDados {
	private ArrayList<Aluno> ListaAlunos;
	 
	public LerDados() {
		ListaAlunos = new ArrayList<Aluno>();
	}

	public void lerDados(String diretorio) {
		try {
			//Pegando os alunos que estao salvo no arquivo txt
			FileReader Arquivo = new FileReader("dados/Alunos.txt");
			BufferedReader Leitura = new BufferedReader(Arquivo);

			while (Leitura.ready()) {
				ListaAlunos.add(separarDadosDoCliente(Leitura.readLine()));
			}
			
			Leitura.close();
		} catch (Exception e) {
			
		}
	}

	private Aluno separarDadosDoCliente(String linha) {
		//separa os dados toda vez que vê um ;
		String Dados[] = linha.split(";");
		//preenche os dados do aluno com os dados separados
		Aluno AlunoAux = new Aluno(Dados[0], Dados[1], Dados[2], Dados[3]);
		
		return AlunoAux;
	}
	
	public ArrayList<Aluno> getLista(){
		return ListaAlunos;
	}

}
