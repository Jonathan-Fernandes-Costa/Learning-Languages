package questao14;

public class Main {

	public static void main(String[] args) {
		
		Pessoa albertinho = new Pessoa(14,3,1879,"Albert Einstein");
		Pessoa isac = new Pessoa(4,1,1643,"Isaac Newton");
		
		albertinho.calculaIdade(3, 4, 2023);
		System.out.println(albertinho.informaNome()+" Idade: "+albertinho.informaIdade());
		isac.calculaIdade(3, 4, 2023);
		System.out.println(isac.informaNome()+" Idade: "+isac.informaIdade());
	}

}
