package code.unidade3.secao3.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Jesimar da Silva Arantes
 */
public class AppFatorial extends Application {
    
    public int numero = 0;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage janela) {
        Button btn = new Button();
        btn.setText("Calcular: " + numero + "!");
        Label lbl = new Label();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn.setText("Calcular: " + (numero+1) + "!");
                String result = String.format("Resultado %d! = %d", 
                        numero, fatorial(numero));
                System.out.println(result);
                lbl.setText(result);
                numero += 1;
                if (numero >= 20) {
                    numero = 0;
                }
            }
        });
        VBox vbox = new VBox(btn, lbl);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setStyle("-fx-background-color: #BBDDFF;");
        Scene cena = new Scene(vbox, 300, 120);        
        janela.setTitle("Aplicação Calcula Fatorial");
        janela.setScene(cena);
        janela.show();
    }
    
    public long fatorial(int n) {
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }
}
