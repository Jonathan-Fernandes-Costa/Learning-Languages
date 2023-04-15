package questoes;

import java.util.Scanner;

public class questao17 {
	public static String inverteString(String str) {
	    char[] chars = str.toCharArray();//Converte a string em um array de caracteres
	    int i = 0;
	    int j = chars.length - 1;
	    while (i < j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	        i++;
	        j--;
	    }
	    return new String(chars);
	}
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o a String a ser invertida");
			String str = ler.next();
			String invertida = inverteString(str);
			System.out.println("String invertida é: "+ invertida);
		}
	}

}
