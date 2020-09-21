package code.unidade4.secao3.ex5;

/**
 * @author Jesimar da Silva Arantes
 * Código 4.19
 */
public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("inicio");
        try {
            System.out.println("inicio sleep");
            Thread.sleep(5000);
            System.out.println("fim sleep");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("fim");
    }
}
