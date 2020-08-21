package code.unidade3.secao3.ap;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *
 * @author jesimar
 */
public class AppJogoGuerra extends Application {
    
    //https://www.gameart2d.com/free-plane-sprite.html
    
    private final String IMG_AVIAO_VOANDO = "../recursos/aviao-voando.png";
    private final String IMG_AVIAO_VOANDORAPIDO = "../recursos/aviao-voando-rapido.png";
    private final String IMG_AVIAO_MORTO = "../recursos/aviao-morto.png";
    private final String IMG_FUNDO = "../recursos/img-fundo.png";
    private final String IMG_BATERIA1 = "../recursos/bateria1.png";
    private final String IMG_BATERIA2 = "../recursos/bateria2.png";
    private final String IMG_BATERIA3 = "../recursos/bateria3.png";
    private final String IMG_BATERIA4 = "../recursos/bateria4.png";
    private final String IMG_BATERIA5 = "../recursos/bateria5.png";
    
    
    private final int DIM_X = 1200;
    private final int DIM_Y = 700;
    private final int altura = 302;
    private final int largura = 443;
    private int posX = 80;
    private int posY = DIM_Y/2 - altura/2;
    private int velocidade = 2;
    private int nivelBateria = 1000;
    
    private final Image imgAviaoVoando = new Image(getClass().getResourceAsStream(IMG_AVIAO_VOANDO));
    private final Image imgAviaoVoandoRapido = new Image(getClass().getResourceAsStream(IMG_AVIAO_VOANDORAPIDO));
    private final Image imgAviaoMorto = new Image(getClass().getResourceAsStream(IMG_AVIAO_MORTO));
    private final Image imgFundo = new Image(getClass().getResourceAsStream(IMG_FUNDO));
    private final Image imgBateria1 = new Image(getClass().getResourceAsStream(IMG_BATERIA1));
    private final Image imgBateria2 = new Image(getClass().getResourceAsStream(IMG_BATERIA2));
    private final Image imgBateria3 = new Image(getClass().getResourceAsStream(IMG_BATERIA3));
    private final Image imgBateria4 = new Image(getClass().getResourceAsStream(IMG_BATERIA4));
    private final Image imgBateria5 = new Image(getClass().getResourceAsStream(IMG_BATERIA5));    
    
    private boolean isLive = true;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        ImageView viewFundo = new ImageView(imgFundo);
        ImageView viewBateria = new ImageView(imgBateria1);
        ImageView viewAviao = new ImageView(imgAviaoVoando);
        
        viewAviao.setTranslateX(posX);
        viewAviao.setTranslateY(posY);
        Group grupo = new Group();
        grupo.getChildren().addAll(viewFundo, viewBateria, viewAviao);
        Scene scene = new Scene(grupo, DIM_X, DIM_Y);
        
        primaryStage.setTitle("Meu Jogo de Guerra");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent evt) {
                if (isLive){
                    if (evt.getCode() == KeyCode.UP) {
                        posY = posY - velocidade;
                        if (posY < 0){
                            posY = 0;
                        }
                        viewAviao.setTranslateX(posX);
                        viewAviao.setTranslateY(posY);
                        nivelBateria -= 1;
                        if (nivelBateria == 750){
                            viewBateria.setImage(imgBateria2);
                        }else if (nivelBateria == 500){
                            viewBateria.setImage(imgBateria3);
                        }else if (nivelBateria == 250){
                            viewBateria.setImage(imgBateria4);
                        }else if (nivelBateria == 0){
                            viewBateria.setImage(imgBateria5);
                            viewAviao.setImage(imgAviaoMorto);
                            isLive = false;
                        }
                    }
                    if (evt.getCode() == KeyCode.DOWN) {
                        posY = posY + velocidade;
                        if (posY > DIM_Y - altura){
                            posY = DIM_Y - altura;
                        }
                        viewAviao.setTranslateX(posX);
                        viewAviao.setTranslateY(posY);
                        nivelBateria -= 1;
                        if (nivelBateria == 750){
                            viewBateria.setImage(imgBateria2);
                        }else if (nivelBateria == 500){
                            viewBateria.setImage(imgBateria3);
                        }else if (nivelBateria == 250){
                            viewBateria.setImage(imgBateria4);
                        }else if (nivelBateria == 0){
                            viewBateria.setImage(imgBateria5);
                            viewAviao.setImage(imgAviaoMorto);
                            isLive = false;
                        }
                    }
                    if (evt.getCode() == KeyCode.LEFT) {
                        posX = posX - velocidade;
                        if (posX < 0){
                            posX = 0;
                        }
                        viewAviao.setTranslateX(posX);
                        viewAviao.setTranslateY(posY);
                        nivelBateria -= 1;
                        if (nivelBateria == 750){
                            viewBateria.setImage(imgBateria2);
                        }else if (nivelBateria == 500){
                            viewBateria.setImage(imgBateria3);
                        }else if (nivelBateria == 250){
                            viewBateria.setImage(imgBateria4);
                        }else if (nivelBateria == 0){
                            viewBateria.setImage(imgBateria5);
                            viewAviao.setImage(imgAviaoMorto);
                            isLive = false;
                        }
                    }
                    if (evt.getCode() == KeyCode.RIGHT) {
                        posX = posX + velocidade;
                        if (posX + largura > DIM_X){
                            posX = DIM_X - largura;
                        }
                        viewAviao.setTranslateX(posX);
                        viewAviao.setTranslateY(posY);
                        nivelBateria -= 1;
                        if (nivelBateria == 750){
                            viewBateria.setImage(imgBateria2);
                        }else if (nivelBateria == 500){
                            viewBateria.setImage(imgBateria3);
                        }else if (nivelBateria == 250){
                            viewBateria.setImage(imgBateria4);
                        }else if (nivelBateria == 0){
                            viewBateria.setImage(imgBateria5);
                            viewAviao.setImage(imgAviaoMorto);
                            isLive = false;
                        }
                    }
                    if (evt.getCode() == KeyCode.SPACE) {
                        if (velocidade == 2){
                            viewAviao.setImage(imgAviaoVoandoRapido);
                            velocidade = 4;
                        }else {
                            viewAviao.setImage(imgAviaoVoando);
                            velocidade = 2;
                        }
                    }
                }
            }
        });
    }
}
