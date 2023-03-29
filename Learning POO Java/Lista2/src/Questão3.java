import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		int num = 64;
		Scanner ler = new Scanner(System.in);
		System.out.println("Advinhe o número entre 1 e 100");
		for(int a = 0; a != num;) {
			System.out.println("Digite a tentativa");
			a = ler.nextInt();
			if(a>100 || a<1) {
				System.out.println("Número inválido!");
			}else {
				if(a>num) {
					System.out.println("Número digitado maior do que o número a ser advinhado");
				}else if(a<num){
					System.out.println("Número digitado menor do que o número a ser advinhado");
				}else{
					System.out.println("Parabéns você acertou!");
				}
			}		
		}
	}
}