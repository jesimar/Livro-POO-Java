package code.unidade3.secao1.ex1;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.4
 */
public class ExemploLeituraDados {
    public static void main(String[] args) {
        //Pode ser necessário utilizar a linha abaixo caso vc queira garantir 
        //que a entrada seja feita com separador ponto ao invés de vírgula.
        //Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor inteiro (int): ");
        int entradaInt = scan.nextInt();
        System.out.print("Digite um valor real (double): ");
        double entradaDouble = scan.nextDouble();
        System.out.print("Digite um valor lógico (boolean): ");
        boolean entradaBoolean = scan.nextBoolean();
        System.out.print("Digite uma string (apenas uma palavra): ");
        String entradaPalavra = scan.next();
        scan.nextLine(); //comando para esvaziar o buffer de entrada
        System.out.print("Digite uma string (um conjunto de palavras): ");
        String entradaString = scan.nextLine();
        System.out.println("Saída dos valores lidos: ");
        System.out.printf("\tValorInteiro: %d%n", entradaInt);
        System.out.printf("\tValorReal: %f%n", entradaDouble);
        System.out.printf("\tValorLógico: %b%n", entradaBoolean);
        System.out.printf("\tValorPalavra: %s%n", entradaPalavra);
        System.out.printf("\tValorFrase: %s%n", entradaString);
    }
}
