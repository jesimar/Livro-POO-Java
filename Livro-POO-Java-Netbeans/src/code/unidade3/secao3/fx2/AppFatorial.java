package code.unidade3.secao3.fx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author jesimar
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
        lbl.setTranslateY(40);
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
        StackPane raiz = new StackPane();
        raiz.getChildren().add(btn);
        raiz.getChildren().add(lbl);        
        Scene cena = new Scene(raiz, 300, 120);        
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
