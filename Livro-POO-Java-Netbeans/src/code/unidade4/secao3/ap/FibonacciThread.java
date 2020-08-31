package code.unidade4.secao3.ap;

/**
 *
 * @author jesimar
 */
public class FibonacciThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 20; i++){
            long fib = fibonacci(i);
            System.out.printf("fibonacci(%d) = %d %n", i, fib);
        }
    }    
    
    public long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
