import java.util.Scanner;
public class Questão10 {

	public static void main(String[] args) {
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o número de linhas e colunas da matriz: ");
		    int n = scanner.nextInt();
		    System.out.println("a)");
		    for (int i = 0; i < n; i++) {
		      for (int j = 0; j <= i; j++) {
		        System.out.print(j + " ");
		      }
		      System.out.println();
		    }
		    System.out.println("b)");
		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < n; j++) {
		          if ((i + j) % 2 == 0) {
		            System.out.print("@ ");
		          } else {
		            System.out.print("* ");
		          }
		        }
		        System.out.println();
		      }
		    System.out.println("c)");
		}

		    
	    }
	    
	    }

	       
		


