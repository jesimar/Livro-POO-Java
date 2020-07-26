//pacote em que a classe TesteImportacao está.
package code.unidade2.secao3;

//importação tradicional de classes 
import java.util.Random;

//importação estática de classes 
import static java.lang.System.out;
import static java.lang.Math.*;

/**
 *
 * @author Jesimar da Silva Arantes
 */
public class TesteImportacao {
    public static void main(String[] args) {
        out.println("Numero PI = " + PI);
        out.println("Numero E = " + E);
        out.println("Raiz(25) = " + sqrt(25));
        out.println("Potencia(2^10) = " + pow(2, 10));
        out.println("Logaritmo(100) = " + log10(100));
        Random rnd = new Random();
        out.println("Aleatório = " + rnd.nextDouble());
    }
}
