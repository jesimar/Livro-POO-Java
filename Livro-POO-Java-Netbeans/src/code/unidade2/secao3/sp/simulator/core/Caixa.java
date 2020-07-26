package code.unidade2.secao3.sp.simulator.core;

import java.util.Objects;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Caixa extends CaixaIdeia {
    public String nomeItem;
    public int qtdItem;
    public Caixa(String nomeItem, int qtdItem, int posX, int posY, float peso, 
            float comprimento, float largura, float altura) {
        super(posX, posY, peso, comprimento, largura, altura);
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
    }

    @Override
    public String toString() {
        return "Caixa{" + "nomeItem=" + nomeItem + ", qtdItem=" + qtdItem + '}';
    }
}
