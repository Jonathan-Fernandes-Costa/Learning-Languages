import java.util.Scanner;
public class Questão8 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite a expressão matemática: ");
			String expressao = ler.next();
			
			if(verifica(expressao)){
				System.out.println("Expressão bem formada!");
			}else {
				System.out.println("Expressão mal formada!");
			}
			
		}
		
		
	}
	public static boolean verifica(String expressao) {
		int parentese =0;
		int colchete = 0;
		int chaves = 0;
		for(int i =0; i< expressao.length(); i++) {
			char caractere = expressao.charAt(i);
			if(caractere == '(') {
				parentese++;
			}else if(caractere == ')') {
				parentese--;
			}
			if(caractere == '[') {
				colchete++;
			}else if(caractere == ']') {
				colchete--;
			}
			if(caractere == '{') {
				chaves++;
			}else if(caractere == '}') {
				chaves--;
			}
		}
		if(parentese == 0 && colchete == 0 && chaves == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
