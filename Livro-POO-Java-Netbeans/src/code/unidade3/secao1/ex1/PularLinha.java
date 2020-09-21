package code.unidade3.secao1.ex1;

import java.util.Formatter;

/**
 * @author Jesimar da Silva Arantes
 * Testes pular linha
 */
public class PularLinha {
    public static void main(String[] args) {
        System.out.format("Utilizando System.out.format: %s%f%n", "Valor Pi: ", 3.1415);
        String strFormat = String.format("Utilizando String.format: %s%f%n", "Valor Pi: ", 3.1415);
        System.out.print(strFormat);
        Formatter objFormatter = new Formatter();
        objFormatter.format("%s%f%n", "Valor Pi: ", 3.1415);
        System.out.println("Utilizando Formatter: " + objFormatter);
    }
}
