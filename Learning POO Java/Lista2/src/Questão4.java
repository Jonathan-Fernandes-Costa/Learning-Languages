import java.util.Scanner;
public class Questão4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num = 0;
		System.out.println("Digite o número que você deseja ver a tabela de multiplicação:");
		num = ler.nextInt();
		for(int a =0; a<=10;a++) {
			int multiplicacao = num*a;
			System.out.println(num+" x "+a+" = "+ multiplicacao);
		}
	}

}
