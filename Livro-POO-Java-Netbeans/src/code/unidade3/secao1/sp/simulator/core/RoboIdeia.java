package code.unidade3.secao1.sp.simulator.core;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.11
 */
public abstract class RoboIdeia {
    protected float posicaoX;
    protected float posicaoY;
    protected int orientacao;
    protected String nome;
    protected float peso;
    
    public abstract void move(float posX, float posY);    
    public abstract void moveX(float dist);    
    public abstract void moveY(float dist);
}
