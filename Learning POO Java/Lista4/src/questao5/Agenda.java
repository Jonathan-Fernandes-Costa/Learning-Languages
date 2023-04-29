package questao5;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contato> contatos;
	private String nome;
	private String desc;

	public Agenda(String nome, String desc) {
		this.contatos = new ArrayList<>();
		this.nome = nome;
		this.desc = desc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public void removerContato(int codigo) {
		for (int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).codigo == codigo) {
				contatos.remove(i);
			}
		}
	}
	public void getContatos() {
		for (int i = 0; i < contatos.size(); i++) {
				contatos.get(i).imprimeContato();
			}
		}
        
	public int getTotalContatos() {
        return contatos.size();
    }
	public Contato buscarContato(int codigo) {
		for (int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).codigo == codigo) {
				return contatos.get(i);
			}
		}
		return null;
		
	}
}
