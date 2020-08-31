package code.unidade4.secao3.ex1;

/**
 *
 * @author jesimar
 */
public class SimplesApp {
    public static void main(String[] args) {
        Thread threadFluxo = Thread.currentThread();
        System.out.printf("Nome da Thread: %s %n", threadFluxo.getName());
    }
}
