package code.unidade2.secao1.sp;

/**
 * @author Jesimar S. Arantes
 * Código 2.6
 */
public class App {
    public static void main(String[] args) {
        Robo objRobo = new Robo();
        objRobo.printStatus();
        objRobo.move(60, 50);
        objRobo.printStatus();
        objRobo.move(55);
        objRobo.printStatus();
    }
}
