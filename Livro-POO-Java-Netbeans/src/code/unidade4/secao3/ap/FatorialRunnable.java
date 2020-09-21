package code.unidade4.secao3.ap;

/**
 * @author Jesimar da Silva Arantes
 * Código Aula Prática
 */
public class FatorialRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            long fat = fatorial(i);
            System.out.printf("fatorial(%d) = %d %n", i, fat);
        }
    }    
    
    public static long fatorial(int n){
        if (n == 1 || n == 0 ) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
