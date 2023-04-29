package questao5;


public class Cliente {
	private String nome;
	private Agenda agenda;

	public Cliente(String nome, String nomeagenda, String descAgenda) {
		this.nome = nome;
		this.agenda = new Agenda(nomeagenda, descAgenda);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void adicionarContato(Contato contato) {
        agenda.adicionarContato(contato);
    }

    public void removerContato(int codigo) {
        agenda.removerContato(codigo);
    }

    public Contato buscarContato(int codigo) {
        return agenda.buscarContato(codigo);
    }
    public void mostrarContatos() {
    	agenda.getContatos();
    }
}
