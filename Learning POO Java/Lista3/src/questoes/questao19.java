package questoes;

import java.util.Scanner;

public class questao19 {
	public static boolean verificaNum(int num) {
	    int sum = 0;
	    for (int i = 1; i <= num / 2; i++) {
	        if (num % i == 0) {
	            sum += i;
	        }
	    }
	    return sum == num;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o numero: ");
			int num = ler.nextInt();
			boolean verifica = verificaNum(num);
			if(verifica) {
				System.out.println("Numero perfeito!");
			}else {
				System.out.println("Numero não perfeito!");
			}
		}
	}

}
