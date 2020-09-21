package code.unidade2.secao3.sp.simulator.main;

import code.unidade2.secao3.sp.simulator.core.Caixa;
import code.unidade2.secao3.sp.simulator.core.Robo;

/**
 * @author Jesimar S. Arantes
 * Código 2.14
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
        Caixa caixa1 = new Caixa("Caixa de Livros",     15, 20, 20, 30, 0.40f, 0.40f, 0.30f);
        Caixa caixa2 = new Caixa("Caixa de HDs",        25, 30, 20, 40, 0.50f, 0.50f, 0.30f);
        Caixa caixa3 = new Caixa("Caixa de Impressoras", 3, 20, 20, 40, 0.60f, 0.60f, 0.40f);
    }
}
