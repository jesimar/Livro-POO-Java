package code.unidade3.secao3.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author Jesimar S. Arantes
 * Código 3.24
 */
public class AppFibonacci extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage janela) {
        Label lbl = new Label("Calcula Fibonacci");
        lbl.setTextFill(Color.DARKGREEN);
        lbl.setFont(Font.font("Serif", 25));
        TextField numField = new TextField();
        ImageView imgBtn = new ImageView(new Image(getClass()
                .getResourceAsStream("recursos/icons/mission.png")));
        Button btn = new Button("Calcular", imgBtn);
        TextArea textArea = new TextArea();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    int num = Integer.parseInt(numField.getText());
                    if (num >= 1 && num <= 42) {
                        String resultado = String.format(
                                "Fibonacci(%d) = %d\n", 
                                num, fibonacci(num));
                        textArea.appendText(resultado);
                    } else if (num < 1) {
                        String msg = String.format(
                                "O número deve ser maior ou igual a 1\n");
                        textArea.appendText(msg);
                    } else if (num > 42) {
                        String msg = String.format(
                                "Número muito grande tente um valor menor\n");
                        textArea.appendText(msg);
                    }                    
                } catch (Exception ex) {
                    String msg = String.format(
                            "Digite um número inteiro válido\n");
                    textArea.appendText(msg);
                }
            }
        });
        
        VBox vbox = new VBox(lbl, numField, btn, textArea);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setStyle("-fx-background-color: #BBDDFF;");
        Scene cena = new Scene(vbox, 400, 300);        
        janela.setTitle("Aplicação Calcula Fibonacci");
        janela.setScene(cena);
        janela.show();
    }
    
    public long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
