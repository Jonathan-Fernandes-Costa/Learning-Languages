package trabalho;

public class Emprestimo {

	private Cliente cliente;
	private Publicacao publicacao;

	public Emprestimo(Cliente cliente, Publicacao publicacao) {
		if(cliente.verificaSePodeEmprestimo() && publicacao.verificaDiponivel()) {
			this.cliente = cliente;
			this.publicacao = publicacao;
			this.cliente.computaTp(publicacao);
			this.cliente.historico.add(publicacao);
			System.out.println("Emprestimo Realizado "+ cliente.tipo+":"+cliente.nome+" - "+publicacao.tipo+":"+publicacao.titulo+" Tem um total de "+cliente.verificarDias()+" dias");
		}else {
			System.out.println("Não foi Possivel fazer o Emprestimo");
		}
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public String retornarDadosEmprestimo() {

		String saida = "";
		saida = this.cliente.tipo+":" + this.cliente.nome;
		return saida;
	}
}
