package code.unidade3.secao3.sp.simulator.core;

/**
 * Classe que modela a entidade Caixa.
 * @author Jesimar S. Arantes
 * Código 3.29
 */
public class Caixa extends CaixaIdeia {
    
    public String nomeItem;
    public int qtdItem;
    
    /**
     * Construtor da caixa.
     * @param nomeItem nome do item que está na caixa.
     * @param qtdItem quantidade de itens que está na caixa.
     * @param posX posição x da caixa.
     * @param posY posição y da caixa.
     * @param peso valor do peso da caixa.
     * @param comprimento valor do comprimento da caixa.
     * @param largura valor da largura da caixa.
     * @param altura valor da altura da caixa.
     */
    public Caixa(String nomeItem, int qtdItem, int posX, int posY, float peso, 
            float comprimento, float largura, float altura) {
        super(posX, posY, peso, comprimento, largura, altura);
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
    }

    /**
     * Método que imprime o estado do objeto.
     * @return retorna uma string que representa o estado do objeto.
     */
    @Override
    public String toString() {
        return "Caixa{" + "nomeItem=" + nomeItem + ", qtdItem=" + qtdItem + '}';
    }
}
