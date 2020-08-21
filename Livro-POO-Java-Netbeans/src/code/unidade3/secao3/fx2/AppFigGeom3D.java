package code.unidade3.secao3.fx2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

/**
 *
 * @author jesimar
 */
public class AppFigGeom3D extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Box caixa = new Box(100.0, 100.0, 100.0); 
        caixa.setTranslateX(100); 
        caixa.setTranslateY(60);
        
        Sphere esfera = new Sphere(50);
        esfera.setTranslateX(250);
        esfera.setTranslateY(60);
        
        Cylinder cilindro = new Cylinder(50, 100);
        cilindro.setTranslateX(400);
        cilindro.setTranslateY(60);
        
        PerspectiveCamera camera = new PerspectiveCamera(false); 
        camera.setTranslateX(0); 
        camera.setTranslateY(0); 
        camera.setTranslateZ(-50); 
        
        Group grupo = new Group();
        grupo.getChildren().addAll(caixa, esfera, cilindro);
        Scene scene = new Scene(grupo, 500, 150);
        scene.setCamera(camera); 
        
        primaryStage.setTitle("Aplicação Figuras Geométricas 3D");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
