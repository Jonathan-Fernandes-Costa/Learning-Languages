
public class Questoes {

	public static void main(String[] args) {
		int A = 15;
		int B = 5;
		//1° Questão
		if(A > 10) {
			System.out.println("A > 10");
			if(A+B == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("número não válido");
			}
		}
	
		
		//2° Questão
		if(A<10) {
			System.out.println("A < 10");
			if(A+B == 20) {
				System.out.println("A + B == 20");
			}
		}else {
			System.out.println("número não válido");
		}
		
		//3° Questão
		if(A == 10) {
			System.out.println("A == 10");
			if(A+B == 20) {
				System.out.println("A + B == 20");
			}
		}
		if(B == 10) {
			System.out.println("B == 10");
		}
		
		//4° Questão
		if(A > 10 || A+B == 20) {
			System.out.println("número válido");
		}else if(A == B) {
			System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
		}else {
			System.out.println("número não válido");
		}
		
		//5° Questão
		if(A > 10 || A+B == 20) {
			System.out.println("número válido");
		}else {
			System.out.println("número não válido");
		}
		
		//6° Questão
		if(A > 10) {
			System.out.println("A > 10");
		}else {
			System.out.println("A <= 10");
		}
		if(A + B == 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("A + B != 20");
		}
		
		// 7° Questão
		if(A > 10 || A + B == 20) {
			System.out.println("números válidos");
		}
		if(A <= 10){
			System.out.println("número não válido");
		}
		
		//8° Questão
		if(A > 10) {
			System.out.println("A > 10");
			if(A + B == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("número não válido");
			}
		}
		
		//9° Questão
		if(A > 10) {
			if(A + B == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("número não válido");
			}
		}else {
			System.out.println("número não válido");
		}
		
		//10° Questão
		if(A > 10) {
			
		}else {
			System.out.println("número menor que 10");
		}
		if(A + B == 20) {
			
		}else {
			System.out.println("número diferente de 20");
		}
		
		//11° Questão
		if(A > 10) {
			
		}else {
			if(A + B == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("número não válido");
			}
		}
		
		//12° Questão
		int result=0;
		if(A > 10) {
			System.out.println("A > 10");
			result++;
		}
		if(A + B == 20) {
			System.out.println("A + B == 20");
			result++;
		}
		if(result < 2) {
			System.out.println("números não válidos");
		}
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
	
		//13° Questão
		int result2=0;
		if(A > 10) {
			System.out.println("A > 10");
			result2++;
		}
		if(A + B == 20) {
			System.out.println("A + B == 20");
			result2++;
		}
		if(result2<2) {
			System.out.println("números não válidos");
		}
	}
	

}
