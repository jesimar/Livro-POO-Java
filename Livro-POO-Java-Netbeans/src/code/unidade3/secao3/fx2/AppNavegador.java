package code.unidade3.secao3.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class AppNavegador extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        WebView webview = new WebView();
        webview.getEngine().load(
                "https://www.google.com/"
        );
        webview.setPrefSize(1000, 700);

        stage.setScene(new Scene(webview));
        stage.show();
    }
}
