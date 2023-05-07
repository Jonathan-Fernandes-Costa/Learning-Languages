package trabalho;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Emprestimo> listaEmprestimo;
	private ArrayList<Cliente> clientes;
	private ArrayList<Publicacao> publicacao;
	
	public Biblioteca() {
	   listaEmprestimo = new ArrayList<Emprestimo>();
	   clientes = new ArrayList<Cliente>();
	   publicacao = new ArrayList<Publicacao>();
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Publicacao> getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(ArrayList<Publicacao> publicacao) {
		this.publicacao = publicacao;
	}

	public void addEmprestimo(Emprestimo e) {
		listaEmprestimo.add(e);
	}

	public void addPublicacao(Publicacao p) {
		publicacao.add(p);
	}
	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	public ArrayList<Emprestimo> getListaEmprestimo() {
		return listaEmprestimo;
	}
	public void todosAcervo() {
		int aux = 1;
		for (int i = 0; i < publicacao.size(); i++) {
				System.out.println(aux + " - " + publicacao.get(i).print());
				aux++;
			}
		}
	
	public void listarAcervo() {
		System.out.println("Livros: ");
		int aux = 1;
		for (int i = 0; i < publicacao.size(); i++) {
			if (publicacao.get(i).tipo == "Livro") {
				System.out.println(aux + " - " + publicacao.get(i).print());
				aux++;
			}
		}
		aux = 1;
		System.out.println("Artigos: ");
		for (int i = 0; i < publicacao.size(); i++) {
			if (publicacao.get(i).tipo == "Artigo") {
				System.out.println(aux + " - " + publicacao.get(i).print());
				aux++;
			}
		}
		aux = 1;
		System.out.println("TCC: ");
		for (int i = 0; i < publicacao.size(); i++) {
			if (publicacao.get(i).tipo == "TCC") {
				System.out.println(aux + " - " + publicacao.get(i).print());
				aux++;
			}
		}
		aux = 1;
		System.out.println("Revistas: ");
		for (int i = 0; i < publicacao.size(); i++) {
			if (publicacao.get(i).tipo == "Revista") {
				System.out.println(aux + " - " + publicacao.get(i).print());
				aux++;
			}
		}
	}
	public void todosClientes() {
		int aux = 1;
		for (int i = 0; i < clientes.size(); i++) {
				System.out.println(aux + " - " + clientes.get(i).print());
				aux++;
			}
		}
	public void listarClientes() {
		int aux = 1;
		System.out.println("Professores: ");
		for (int i = 0; i < clientes.size(); i++) {

			if (clientes.get(i).tipo == "Professor") {

				System.out.println(aux + " - " + clientes.get(i).print());
				aux++;
			}
		}
		aux = 1;
		System.out.println("Alunos: ");
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).tipo == "Aluno") {
				System.out.println(aux + " - " + clientes.get(i).print());
				aux++;
			}
		}
		aux = 1;
		System.out.println("Servidores: ");
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).tipo == "Servidor") {
				System.out.println(aux + " - " + clientes.get(i).print());
				aux++;
			}
		}
	}
	public void consultaEmprestimos(int matricula) {
		System.out.println("Publicações emprestadas: ");
		for (int i = 0; i < listaEmprestimo.size(); i++) {
			if(listaEmprestimo.get(i).getCliente().matricula == matricula) {
				System.out.println(listaEmprestimo.get(i).getPublicacao().titulo);
			}
		}
	}
	public boolean pesquisaPublicacao(String nome) {
		for (int i = 0; i < publicacao.size(); i++) {
			if(publicacao.get(i).titulo.equalsIgnoreCase(nome)) {
				return true;
			}
		}
		return false;
	}
	public void gerarRelatorio() {
		getLivros();
		getArtigos();
		getTCCs();
		getRevistas();
	}
	public void listarEmprestimos() {
		for (int i = 0; i < listaEmprestimo.size(); i++) {
			System.out.println(listaEmprestimo.get(i).retornarDadosEmprestimo());
		}

	}
	public void getLivros() {
		int aux=0;
		for (int i = 0; i < listaEmprestimo.size() ;i++) {
			if(listaEmprestimo.get(i).getPublicacao() instanceof Livro) {
				aux++;
			}
		}
		System.out.println("Livros: Total "+aux);
		for (int i = 0; i < listaEmprestimo.size() ;i++) {
			if(listaEmprestimo.get(i).getPublicacao() instanceof Livro) {
				System.out.println(listaEmprestimo.get(i).retornarDadosEmprestimo());
			}
		}
	}
	public void getArtigos() {
		int aux=0;
		for (int i = 0; i < listaEmprestimo.size() ;i++) {
			if(listaEmprestimo.get(i).getPublicacao() instanceof Artigo) {
				aux++;
			}
		}
		System.out.println("Artigos: Total "+aux);
		for (int i = 0; i < listaEmprestimo.size() ;i++) {
			if(listaEmprestimo.get(i).getPublicacao() instanceof Artigo) {
				System.out.println(listaEmprestimo.get(i).retornarDadosEmprestimo());
			}
		}
	}
	public void getTCCs() {
		int aux=0;
		for (int i = 0; i < listaEmprestimo.size() ;i++) {
			if(listaEmprestimo.get(i).getPublicacao() instanceof Tcc) {
				aux++;
			}
		}
		System.out.println("TCCs: Total "+aux);
		for (int i = 0; i < listaEmprestimo.size() ;i++) {
			if(listaEmprestimo.get(i).getPublicacao() instanceof Tcc) {
				System.out.println(listaEmprestimo.get(i).retornarDadosEmprestimo());
			}
		}
	}
	public void getRevistas() {
		int aux=0;
		for (int i = 0; i < listaEmprestimo.size() ;i++) {
			if(listaEmprestimo.get(i).getPublicacao() instanceof Revista) {
				aux++;
			}
		}
		System.out.println("Revistas: Total "+aux);
		for (int i = 0; i < listaEmprestimo.size() ;i++) {
			if(listaEmprestimo.get(i).getPublicacao() instanceof Revista) {
				System.out.println(listaEmprestimo.get(i).retornarDadosEmprestimo());
			}
		}
	}
	
}
