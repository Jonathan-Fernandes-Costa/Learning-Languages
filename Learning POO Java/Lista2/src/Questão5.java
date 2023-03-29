import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o limite superior dos pares da esquerda: ");
        int limiteEsquerda = ler.nextInt();

        System.out.print("Digite o limite superior dos pares da direita: ");
        int limiteDireita = ler.nextInt();

        for (int a = 0; a <= limiteEsquerda; a++) {
            for (int b = 0; b <= limiteDireita; b++) {
                System.out.println(a + " - " + b);
            }
        }
    }
}