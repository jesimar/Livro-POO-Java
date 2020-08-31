package code.unidade4.secao3.ex4;

/**
 *
 * @author jesimar
 */
public class AppPrimoThread {
    public static void main(String[] args) {
        Thread threadPrimo1 = new Thread(new Primo(0,        10000000));
        threadPrimo1.start();
        Thread threadPrimo2 = new Thread(new Primo(10000001, 20000000));
        threadPrimo2.start();
        Thread threadPrimo3 = new Thread(new Primo(20000001, 30000000));
        threadPrimo3.start();
        Thread threadPrimo4 = new Thread(new Primo(30000001, 40000000));
        threadPrimo4.start();
    }
}
