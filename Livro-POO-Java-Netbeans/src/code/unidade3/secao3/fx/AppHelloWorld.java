package code.unidade3.secao3.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Jesimar S. Arantes
 * Código 3.23
 */
public class AppHelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage janela) {
        Button btn = new Button();
        btn.setText("Imprime 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane raiz = new StackPane();
        raiz.getChildren().add(btn);

        Scene cena = new Scene(raiz, 300, 100);

        janela.setTitle("Aplicação Hello World!");
        janela.setScene(cena);
        janela.show();
    }
}
