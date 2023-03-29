import java.util.Scanner;
public class Questão6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas da matriz: ");
        
        int tamanho = ler.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        
        System.out.println("Digite os elementos da matriz:");
        
        for(int a =0; a<tamanho;a++) {
        	for(int b=0; b<tamanho;b++) {
        		matriz[a][b]= ler.nextInt();
        	}
        }
        
        boolean resultado = true;
        
        for(int a = 0;a<tamanho;a++) {
        	for (int b = 0; b < tamanho; b++) {
				if(matriz[a][b] != matriz[b][a]) {
					resultado = false;
				}else if(a == tamanho - 1 && b == tamanho -1 && resultado) {
					System.out.println("A matriz é simétrica.");
				}
			}
        	
        }
        if(resultado == false) {
    		System.out.println("A matriz não é simétrica");
    	}

	}

}
