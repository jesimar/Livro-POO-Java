package code.unidade4.secao3.ap;

/**
 * @author Jesimar da Silva Arantes
 * Código Aula Prática
 */
public class Teste2 {
    public static void main(String[] args) {
        Thread threadFib = new Thread(new FibonacciThread());
        threadFib.start();
        Thread threadFat = new Thread(new FatorialThread());
        threadFat.start();
    }
}
