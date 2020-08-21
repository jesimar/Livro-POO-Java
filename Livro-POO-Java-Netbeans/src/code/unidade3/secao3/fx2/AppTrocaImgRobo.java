package code.unidade3.secao3.fx2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 *
 * @author jesimar
 */
public class AppTrocaImgRobo extends Application {
    
    private final String IMG_FRENTE = "https://raw.githubusercontent.com/jesimar/Livro-POO-Java/master/src/unidade1/secao3/project-05-java/images/robo1.png";
    private final String IMG_COSTAS = "https://raw.githubusercontent.com/jesimar/Livro-POO-Java/master/src/unidade1/secao3/project-05-java/images/robo2.png";
    private final String IMG_ESQ = "https://raw.githubusercontent.com/jesimar/Livro-POO-Java/master/src/unidade1/secao3/project-05-java/images/robo3.png";
    private final String IMG_DIR = "https://raw.githubusercontent.com/jesimar/Livro-POO-Java/master/src/unidade1/secao3/project-05-java/images/robo4.png";
    
    private final int altura = 60;
    private final int largura = 64;
    private int posX = 150 - largura/2;
    private int posY = 60 - altura/2;
    
    private final Image imgRoboFrente = new Image(IMG_FRENTE);
    private final Image imgRoboCostas = new Image(IMG_COSTAS);
    private final Image imgRoboEsq = new Image(IMG_ESQ);
    private final Image imgRoboDir = new Image(IMG_DIR);
    
    private final ImageView view = new ImageView(imgRoboFrente);
        
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        view.setTranslateX(posX);
        view.setTranslateY(posY);
        Group grupo = new Group();
        grupo.getChildren().addAll(view);
        Scene scene = new Scene(grupo, 300, 120);
        
        primaryStage.setTitle("Aplicação Movimentar Robô");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        scene.setOnKeyPressed((evt) -> {
            if (evt.getCode() == KeyCode.UP) {
                System.out.println("cima");
                view.setImage(imgRoboCostas);
                view.setTranslateX(posX);
                view.setTranslateY(posY);
            }
            if (evt.getCode() == KeyCode.DOWN) {
                System.out.println("baixo");
                view.setImage(imgRoboFrente);
            }
            if (evt.getCode() == KeyCode.LEFT) {
                System.out.println("esquerda");
                view.setImage(imgRoboEsq);
            }
            if (evt.getCode() == KeyCode.RIGHT) {
                System.out.println("direita");
                view.setImage(imgRoboDir);
            }
        });
    }
}
