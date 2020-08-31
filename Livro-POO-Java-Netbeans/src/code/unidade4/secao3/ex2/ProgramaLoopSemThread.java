package code.unidade4.secao3.ex2;

/**
 *
 * @author jesimar
 */
public class ProgramaLoopSemThread {

    public static void main(String[] args) {
        ProgramaLoopSemThread p = new ProgramaLoopSemThread();
        p.programa();
    }

    public void programa() {
        System.out.println("inicio");
        
        while (true) {
            if (1 % 2 == 2) break; //codigo para que o compilador deixe eu executar o programa.
            System.out.println("loop infinito");
        }
        
        System.out.println("passou do primeiro loop");
        for (long i = 0; i < 1000000000000l; i++) {
            System.out.println("loop super pesado");
        }
        
        System.out.println("passou do segundo loop");
        boolean condicaoLoop = true;
        do {
            System.out.println("loop condição complexa");
        } while (condicaoLoop);
        
        System.out.println("fim");
    }
}
