package code.unidade4.secao1.sp.simulator.core;

/**
 * Classe que modela o mundo bidimensional.
 * @author Jesimar S. Arantes
 */
public class Mundo2D {
    
    public final int DIM_X;
    public final int DIM_Y;
    
    /**
     * Construtor da classe mundo.
     * @param dimX valor da dimensão x do mundo.
     * @param dimY valor da dimensão y do mundo.
     */
    public Mundo2D(int dimX, int dimY) {
        this.DIM_X = dimX;
        this.DIM_Y = dimY;
    }
}
