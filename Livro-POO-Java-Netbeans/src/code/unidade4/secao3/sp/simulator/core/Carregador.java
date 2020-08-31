package code.unidade4.secao3.sp.simulator.core;

import javafx.scene.image.ImageView;


/**
 *
 * @author jesimar
 */
public class Carregador implements Runnable {
    
    private float posicaoX;
    private float posicaoY;
    private final ImageView viewCarregador;
    private final int velocidade = 3;

    public Carregador(float posicaoX, float posicaoY, ImageView viewCarregador) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.viewCarregador = viewCarregador;
    }  

    @Override
    public void run() {
        boolean isMoveRight = true;
        while (true) {
            if (isMoveRight) {
                posicaoX += velocidade;
            } else {
                posicaoX -= velocidade;
            }
            if (isMoveRight && posicaoX > 350) {
                isMoveRight = false;
            } else if (!isMoveRight && posicaoX < 190) {
                isMoveRight = true;
            }
            viewCarregador.setTranslateX(posicaoX);
            viewCarregador.setTranslateY(posicaoY);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }            
        }
    }  
    
    public float getPosicaoX() {
        return posicaoX;
    }

    public float getPosicaoY() {
        return posicaoY;
    }
    
    public void setPosicaoX(float posicaoX) {
        this.posicaoX = posicaoX;
    }

    public void setPosicaoY(float posicaoY) {
        this.posicaoY = posicaoY;
    }  
    
}
