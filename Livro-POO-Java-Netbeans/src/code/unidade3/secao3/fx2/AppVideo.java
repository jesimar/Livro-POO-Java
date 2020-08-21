package code.unidade3.secao3.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class AppVideo extends Application {

    private final String VIDEO_URL = getClass().getResource(
            "../fx/recursos/video-fractal.mp4").toString();
    
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage palco) throws Exception {
        Media media = new Media(VIDEO_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        
        StackPane raiz = new StackPane();
        raiz.getChildren().add(mediaView);
        
        Scene cena = new Scene(raiz, 680, 400);
        palco.setTitle("Aplicação Vídeo");
        palco.setScene(cena);
        palco.show();
        mediaPlayer.play();
    }
}
