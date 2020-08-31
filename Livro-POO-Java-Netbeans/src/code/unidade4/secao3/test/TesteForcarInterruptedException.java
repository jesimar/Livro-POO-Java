package code.unidade4.secao3.test;

/**
 *
 * @author jesimar
 */
public class TesteForcarInterruptedException {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
           @Override
            public void run() {
                System.out.println("Inicio Executando");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    System.out.println("Exceção InterruptedException Lançada");
                }
                System.out.println("Fim Executando");
            }
        });
        th.start();
        th.interrupt();
    }
}
