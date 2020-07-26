package code.unidade3.secao1.ex1;

/**
 *
 * @author jesimar
 */
public class SequenciasEscape {
    public static void main(String[] args) throws InterruptedException { 
        System.out.print("Introdução\na\nProgramação\ncom\nJava\n"); 
        System.out.print("Col A\tCol B\tCol C\tCol D\n"); 
        System.out.print("C:\\Windows\\system32\n"); 
        System.out.print("Nome do livro \"Dom Quixote\" de Miguel de Cervantes\n");
        System.out.print("ABC\rXYZ\n");
        //funciona bem quando executado no terminal
        System.out.print("Nome do livro \"Dom Quixote\" \f de Miguel de Cervantes\n");
        
        //funciona bem quando executado no terminal
        for (int i = 0; i < 100; i++){
            System.out.printf("%d", i);
            Thread.sleep(300);
            System.out.printf("\r");
        }
    }
}
