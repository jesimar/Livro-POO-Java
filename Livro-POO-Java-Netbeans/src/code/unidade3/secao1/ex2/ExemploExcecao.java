package code.unidade3.secao1.ex2;

import java.util.Scanner;

/**
 *
 * @author jesimar
 */
public class ExemploExcecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor A: ");
        int valorA = scan.nextInt();
        System.out.print("Digite um valor B: ");
        int valorB = scan.nextInt();
        int valorR = valorA/valorB;
        System.out.printf("(A/B) = (%d/%d) = %d\n", valorA, valorB, valorR);
    }
}
