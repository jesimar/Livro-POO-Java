package code.unidade2.secao2.sp;

/**
 * @author Jesimar S. Arantes
 * Código 2.7
 */
public class App {
    public static void main(String[] args) {
        Robo robo = new Robo();
        for (int d = 0; d < 4; d++) {
            for (int j = 1; j <= 10; j++) {
                robo.printPos();
                switch(d) {
                    case 0: //move ao longo do eixo x para frente
                        robo.move(50 + j * 4, 50);
                        break;
                    case 1: //move ao longo do eixo y para cima
                        robo.move(90, 50 + j * 4);
                        break;
                    case 2: //move ao longo do eixo x para trás
                        robo.move(90 - j * 4, 90);
                        break;
                    case 3: //move ao longo do eixo y para baixo
                        robo.move(50, 90 - j * 4);
                        break;
                }
            }
        }
        robo.printPos();
    }
}
