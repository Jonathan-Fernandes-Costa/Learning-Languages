public class Exercicio1 {

	
	public static void imprimirMensagem(String msg) {
		
		System.out.println(msg);
	}
	
	public static int soma(int primeiro, int segundo, String msg) {
	
	    imprimirMensagem(msg);
		return primeiro + segundo;
	}
	
	public static void main(String[] args) {

		int soma = soma(10,20, "Oi");
		
		
		System.out.println("Resposta da soma:" + soma);
		
		
//		for (int a = 0; a < 10; a++) {
//			System.out.println("Valor de " + a);
//		}
//
//		int a = 0;
//		while (a < 10) {
//			System.out.println("Valor de " + a);
//			a++;
//		}
//		
//		int a=0;
//		do {
//			System.out.println("teste");
//		}while(a<10);
	}
	

}
