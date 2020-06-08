package src.unidade2.secao2.sp;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Caixa {
    String nomeItem;
    int qtdItem;
    int posX;
    int posY;
    float peso;
    final float comprimento;
    final float largura;
    final float altura;
    public Caixa(String nomeItem, int qtdItem, int posX, int posY, float peso, 
            float comprimento, float largura, float altura) {
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
        this.posX = posX;
        this.posY = posY;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }
}
