package code.unidade4.secao3.ap;

/**
 *
 * @author jesimar
 */
public class Teste1 {
    public static void main(String[] args) {
        Thread threadFib = new Thread(new FibonacciRunnable());
        threadFib.start();
        Thread threadFat = new Thread(new FatorialRunnable());
        threadFat.start();
    }
}
