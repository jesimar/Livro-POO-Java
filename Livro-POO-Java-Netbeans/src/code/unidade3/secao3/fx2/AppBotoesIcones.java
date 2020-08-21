package code.unidade3.secao3.fx2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jesimar
 */
public class AppBotoesIcones extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("Conjunto de Botões com Icones");
        
        ImageView imgFacebook = new ImageView(new Image(getClass()
                .getResourceAsStream("../fx/recursos/icones/facebook.png")));
        Button btn = new Button("Facebook", imgFacebook);
        
        ImageView imgWhatsapp = new ImageView(new Image(getClass()
                .getResourceAsStream("../fx/recursos/icones/whatsapp.png")));
        Button btn2 = new Button("Whatsapp", imgWhatsapp);
        
        ImageView imgTwitter = new ImageView(new Image(getClass()
                .getResourceAsStream("../fx/recursos/icones/twitter.png")));
        Button btn3 = new Button("Twitter", imgTwitter);
       
        VBox vbox = new VBox(lbl, btn, btn2, btn3);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.TOP_CENTER);
        
        Scene scene = new Scene(vbox, 300, 240);
        
        primaryStage.setTitle("Aplicação Botões com Icones");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
