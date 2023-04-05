import java.util.Scanner;
public class Questão9 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o conjunto de caracteres: ");
			String conjunto = ler.next();
			int quantidadeDePermutacao = calcPerm(conjunto);	
			permuta(conjunto, 0, quantidadeDePermutacao, 0);
		}

	}
	public static void permuta(String conjunto, int  i, int quantidade, int cont) {
		int x = i;
		for(;i< conjunto.length(); i++) {
			char c = conjunto.charAt(i);
			System.out.print(c);
		}
		if(cont < quantidade) {
			cont++;
			x++;
			permuta(conjunto, x, quantidade, cont);
		}
		
	}
	public static int calcPerm(String conjunto) {
		int quantidade =1;

		for(int i = conjunto.length(); i != 0;i--) {
			quantidade = i * quantidade;
		}
		return quantidade;
	}
	//tentei mas n consegui
}
