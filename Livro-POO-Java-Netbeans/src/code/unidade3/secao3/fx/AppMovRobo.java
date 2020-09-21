package code.unidade3.secao3.fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 * @author Jesimar S. Arantes
 * Código 3.28
 */
public class AppMovRobo extends Application {    
    private final int DIM_X = 300;
    private final int DIM_Y = 220;
    private final int altura = 60;
    private final int largura = 64;
    
    private int posX = DIM_X/2 - largura/2;
    private int posY = DIM_Y/2 - altura/2;
    private int velocidade = 1;    
    
    private final Image imgRoboFrente = new Image(getClass().getResourceAsStream("recursos/robo1.png"));
    private final Image imgRoboCostas = new Image(getClass().getResourceAsStream("recursos/robo2.png"));
    private final Image imgRoboEsq = new Image(getClass().getResourceAsStream("recursos/robo3.png"));
    private final Image imgRoboDir = new Image(getClass().getResourceAsStream("recursos/robo4.png"));    
    private final ImageView imgRobo = new ImageView(imgRoboFrente);
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage janela) {
        imgRobo.setTranslateX(posX);
        imgRobo.setTranslateY(posY);
        Group grupo = new Group();
        grupo.getChildren().addAll(imgRobo);
        Scene cena = new Scene(grupo, DIM_X, DIM_Y);
        
        janela.setTitle("Aplicação Movimentar Robô");
        janela.setScene(cena);
        janela.show();
        
        cena.setOnKeyPressed((evt) -> {
            if (evt.getCode() == KeyCode.UP) {
                imgRobo.setImage(imgRoboCostas);
                posY = posY - velocidade;
                if (posY < 0) {
                    posY = 0;
                }
                imgRobo.setTranslateX(posX);
                imgRobo.setTranslateY(posY);
            }
            if (evt.getCode() == KeyCode.DOWN) {
                imgRobo.setImage(imgRoboFrente);
                posY = posY + velocidade;
                if (posY + altura > DIM_Y) {
                    posY = DIM_Y - altura;
                }
                imgRobo.setTranslateX(posX);
                imgRobo.setTranslateY(posY);
            }
            if (evt.getCode() == KeyCode.LEFT) {
                imgRobo.setImage(imgRoboEsq);
                posX = posX - velocidade;
                if (posX < 0) {
                    posX = 0;
                }
                imgRobo.setTranslateX(posX);
                imgRobo.setTranslateY(posY);
            }
            if (evt.getCode() == KeyCode.RIGHT) {
                imgRobo.setImage(imgRoboDir);
                posX = posX + velocidade;
                if (posX + largura > DIM_X) {
                    posX = DIM_X - largura;
                }
                imgRobo.setTranslateX(posX);
                imgRobo.setTranslateY(posY);
            }
            if (evt.getCode() == KeyCode.SPACE) {
                if (velocidade == 1) {
                    velocidade = 4;
                } else {
                    velocidade = 1;
                }
            }
        });
    }
}
