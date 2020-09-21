package code.unidade3.secao1.ex1;

import java.util.Locale;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.2
 */
public class ExemploLocalizacao {
    public static void main(String[] args) {
        //alterne a execução com essas duas linhas
        Locale.setDefault(new Locale("pt", "BR"));
        //Locale.setDefault(new Locale("en", "US"));
        double pi = 3.141592;
        System.out.printf("Valor Pi: %f%n", pi);
        
        //System.out.printf(Locale.ENGLISH, "Valor Pi: %f%n", pi);
    }
}
