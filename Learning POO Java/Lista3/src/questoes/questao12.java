package questoes;

import java.util.Scanner;

public class questao12 {
	public static boolean isPrimo(int num) {
	    if (num <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o numero");
			int num = ler.nextInt();
			boolean verifica = isPrimo(num);
			if(verifica) {
				System.out.println("É Primo");
			}else {
				System.out.println("Não é Primo");
			}
		}
	}

}
