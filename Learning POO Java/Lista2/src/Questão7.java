import java.util.Scanner;
public class Questão7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int num = ler.nextInt();
		
		int maiorPrimo=0;
		int i = 2;
		while(i<num) {
			boolean resultado = true;
			for(int a=2; a<i;a++) {
				if(i%a == 0) {//Se for divisivel por outro numero sem ser ele mesmo ou 1 não é primo
					resultado=false;
				}
			}
			if(resultado) {
				maiorPrimo=i;
			}
			i++;
		}
		
		System.out.println("O maior número primo menor que "+ num + " é: "+ maiorPrimo);
	}

}
