package code.unidade2.secao3.sp.simulator.core;

/**
 * @author Jesimar S. Arantes
 * Código 2.14
 */
public class CaixaIdeia {
    protected int posX;
    protected int posY;
    protected float peso;
    protected final float comprimento;
    protected final float largura;
    protected final float altura;
    public CaixaIdeia(int posX, int posY, float peso, 
            float comprimento, float largura, float altura) {
        this.posX = posX;
        this.posY = posY;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
