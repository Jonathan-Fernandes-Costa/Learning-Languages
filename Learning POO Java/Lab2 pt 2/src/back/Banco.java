package back;

import java.util.ArrayList;



public class Banco {
	private ArrayList<Aluno> ListaAlunos = new ArrayList<Aluno>();
	
	//CRUD
	//POST
	
	public void adicionarAluno(String nome, String cpf, String mat, String vert) {
		ListaAlunos.add(new Aluno(nome, cpf, mat, vert));
	}
	//DELETE
	public void excluirAluno(int indice) {
		ListaAlunos.remove(indice);
	}
	
	//GET
	public int getQuantAlunos() {
		return ListaAlunos.size();
	}
	public String getNome(int indice) {
		return ListaAlunos.get(indice).getNome();
	}
	
	public String getCPF(int indice) {
		return ListaAlunos.get(indice).getCPF();
	}
	
	public String getMatricula(int indice) {
		return ListaAlunos.get(indice).getMatricula();
	}
	
	public String getVertente(int indice) {
		return ListaAlunos.get(indice).getVertente();
	}
	//PUT
	public void setVertente(int indice, String str) {
		ListaAlunos.get(indice).setVertente(str);;
	}
	//Auxiliares
	public String formatarDados() {
		
		String Saida = "";
		
		for (Aluno Aluno : ListaAlunos) {
			Saida += Aluno.getNome() + ";" + Aluno.getCPF() + ";" + Aluno.getMatricula() + ";" + Aluno.getVertente() + "\n" ;
		}
		
		return Saida;
	}
	
	public void setListaAlunos(ArrayList<Aluno> lista) {
		ListaAlunos = lista;
	}
}
