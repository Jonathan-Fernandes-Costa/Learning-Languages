import java.util.Scanner;
public class Questão2 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int numerodigitado;
			int soma=0;
			for(numerodigitado =0; numerodigitado >=  0;) {
				System.out.println("Digite um número, digite um número negativo para parar");
				numerodigitado = 0;
				numerodigitado = ler.nextInt();
				if(numerodigitado>0)
				soma= soma+numerodigitado;
			}
			System.out.println("O somátorio de todos os números positivos é :"+ soma);
		}
		
		

	}

}
