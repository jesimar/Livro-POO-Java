/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.unidade3.secao3.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jesimar
 */
public class AppComponentes extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Button");
        Label lbl = new Label("Label");
        TextField textf = new TextField();
        TextArea texta = new TextArea();
        RadioButton radiob = new RadioButton("RadioButton");
        CheckBox checkb = new CheckBox("CheckBox");
        
        String week_days[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"}; 
        ComboBox combob = new ComboBox(FXCollections .observableArrayList(week_days));
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(btn, lbl, radiob, checkb, textf, texta, combob);
        
        Scene scene = new Scene(vbox, 150, 250);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.TOP_CENTER);
        
        primaryStage.setTitle("App Componentes!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
