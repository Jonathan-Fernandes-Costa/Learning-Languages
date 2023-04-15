package questoes;

import java.util.Scanner;

public class questao15 {
	public static boolean verificaPalindromo(String str) {
	    str = str.toLowerCase();//resolvendo o bug dos nomes que começam com a letra maiscula.
	    int i = 0;
	    int j = str.length() - 1;

	    while (i < j) {
	        if (str.charAt(i) != str.charAt(j)) {
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o Nome a ser verificado");
			String str = ler.next();
			boolean verifica = verificaPalindromo(str);
			if(verifica) {
				System.out.println("É palindromo");
			}else {
				System.out.println("Não é palindromo");
			}
		}
		

	}

}
