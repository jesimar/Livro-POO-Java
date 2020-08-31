package code.unidade4.secao3.test;

/**
 *
 * @author jesimar
 */
public class TesteMonitoramentoEstados {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
           @Override
            public void run() {
                System.out.println("Inicio Executando");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {

                }
                System.out.println("Fim Executando");
            }
        });
        System.out.println(th.getState());
        th.start();
        System.out.println(th.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        System.out.println(th.getState());
        try {
            th.join(1000);
        } catch (InterruptedException ex) {
            
        }
        System.out.println(th.getState());
    }
}
