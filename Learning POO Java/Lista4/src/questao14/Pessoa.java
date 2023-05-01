package questao14;

public class Pessoa {
	private int idade;
	private int dia;
	private int mes;
	private int ano;
	private String nome;
	public Pessoa(int dia, int mes, int ano, String nome) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.nome = nome;
	}//03/04/2004
	public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
		if(mesAtual == mes) {
			if(diaAtual>=dia) {
				idade = anoAtual - ano;
			}else {
				idade = (anoAtual-1)-ano;
			}
		}else if(mesAtual > mes) {
			idade = anoAtual - ano;
		}else {
			idade = (anoAtual-1) - ano;
		}
	}
	public int informaIdade() {
		return idade;
	}
	public String informaNome() {
		return nome;
	}
	public void ajustaDataDeNascimentoa(int dianew,int mesnew, int anonew) {
		dia = dianew;
		mes = mesnew;
		ano = anonew;
	}
	
}
