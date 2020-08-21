package code.unidade3.secao3.fx2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * Código adaptado de: 
 *     https://docs.oracle.com/javase/8/javafx/media-tutorial/playercontrol.htm
 * @author jesimar
 */
public class EmbeddedMediaPlayer extends Application {
    private final String MEDIA_URL = getClass().getResource(
            "../fx/recursos/video-fractal.mp4").toString();

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene cena = new Scene(root,  640, 450);

        Media media = new Media (MEDIA_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        
        MediaControl mediaControl = new MediaControl(mediaPlayer);
        cena.setRoot(mediaControl);
        
        primaryStage.setTitle("Embedded Media Player");
        primaryStage.setScene(cena);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}

