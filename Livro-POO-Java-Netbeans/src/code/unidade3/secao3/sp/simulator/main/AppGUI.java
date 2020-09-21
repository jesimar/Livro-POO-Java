package code.unidade3.secao3.sp.simulator.main;

import code.unidade3.secao3.sp.simulator.core.Caixa;
import code.unidade3.secao3.sp.simulator.core.Mundo2D;
import code.unidade3.secao3.sp.simulator.core.Robo;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 * Classe principal que inicia o simulador do robô.
 * @author Jesimar S. Arantes
 * Código 3.29
 */
public class AppGUI extends Application {
    
    private final String IMG_FUNDO = "recursos/galpao.png";
    private final String IMG_FRENTE = "recursos/robo1.png";
    private final String IMG_COSTAS = "recursos/robo2.png";
    private final String IMG_ESQ = "recursos/robo3.png";
    private final String IMG_DIR = "recursos/robo4.png";
    private final String IMG_BOX_LVR = "recursos/box.png";
    private final String IMG_BOX_HD  = "recursos/box2.png";
    private final String IMG_BOX_PRT = "recursos/box3.png";
    
    private final Image imgFundo = new Image(getClass().getResourceAsStream(IMG_FUNDO));
    private final Image imgRoboFrente = new Image(getClass().getResourceAsStream(IMG_FRENTE));
    private final Image imgRoboCostas = new Image(getClass().getResourceAsStream(IMG_COSTAS));
    private final Image imgRoboEsq = new Image(getClass().getResourceAsStream(IMG_ESQ));
    private final Image imgRoboDir = new Image(getClass().getResourceAsStream(IMG_DIR));
    private final Image imgBoxLvr = new Image(getClass().getResourceAsStream(IMG_BOX_LVR));
    private final Image imgBoxHd  = new Image(getClass().getResourceAsStream(IMG_BOX_HD));
    private final Image imgBoxPrt = new Image(getClass().getResourceAsStream(IMG_BOX_PRT));
    
    private final ImageView viewFundo = new ImageView(imgFundo);
    private final ImageView viewRobo = new ImageView(imgRoboFrente);
    private final ImageView viewBoxLvr = new ImageView(imgBoxLvr);
    private final ImageView viewBoxHd  = new ImageView(imgBoxHd);
    private final ImageView viewBoxPrt = new ImageView(imgBoxPrt);
    
    private final Mundo2D mundo = new Mundo2D(600, 400);
    private final Robo robo = new Robo(32, 300);
    private final Caixa caixaLvr = new Caixa("Caixa de Livros",     15, 25, 100, 30, 0.40f, 0.40f, 0.30f);
    private final Caixa caixaHd  = new Caixa("Caixa de HDs",        20, 280, 50, 40, 0.50f, 0.50f, 0.30f);
    private final Caixa caixaPrt = new Caixa("Caixa de Impressoras", 8, 525, 100, 40, 0.60f, 0.60f, 0.40f);
    
    
    /**
     * Ponto de entrada da aplicação.
     * @param args lista de argumentos recebido via linha de comando.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage janela) {
        viewFundo.setTranslateX(0);
        viewFundo.setTranslateY(0);
        
        viewBoxLvr.setTranslateX(caixaLvr.getPosX());
        viewBoxLvr.setTranslateY(caixaLvr.getPosY());
        
        viewBoxHd.setTranslateX(caixaHd.getPosX());
        viewBoxHd.setTranslateY(caixaHd.getPosY());
        
        viewBoxPrt.setTranslateX(caixaPrt.getPosX());
        viewBoxPrt.setTranslateY(caixaPrt.getPosY());
        
        viewRobo.setTranslateX(robo.getPosicaoX());
        viewRobo.setTranslateY(robo.getPosicaoY());
        
        Group grupo = new Group();
        grupo.getChildren().addAll(viewFundo, viewBoxLvr, viewBoxHd, viewBoxPrt, viewRobo);
        
        Scene cena = new Scene(grupo, mundo.DIM_X, mundo.DIM_Y);
        
        janela.setTitle("Simulador de Robótica");
        janela.setScene(cena);
        janela.show();
        
        cena.setOnKeyPressed((evt) -> {
            if (evt.getCode() == KeyCode.UP) {
                viewRobo.setImage(imgRoboCostas);
                robo.setPosicaoY(robo.getPosicaoY() - (int)robo.getVelocidade());
                if (robo.getPosicaoY() < 0){
                    robo.setPosicaoY(0);
                }
                viewRobo.setTranslateX(robo.getPosicaoX());
                viewRobo.setTranslateY(robo.getPosicaoY());
            }
            if (evt.getCode() == KeyCode.DOWN) {
                viewRobo.setImage(imgRoboFrente);
                robo.setPosicaoY(robo.getPosicaoY() + (int)robo.getVelocidade());
                if (robo.getPosicaoY() + robo.getAltura() > mundo.DIM_Y){
                    robo.setPosicaoY(mundo.DIM_Y - robo.getAltura());
                }
                viewRobo.setTranslateX(robo.getPosicaoX());
                viewRobo.setTranslateY(robo.getPosicaoY());
            }
            if (evt.getCode() == KeyCode.LEFT) {
                viewRobo.setImage(imgRoboEsq);
                robo.setPosicaoX(robo.getPosicaoX() - (int)robo.getVelocidade());
                if (robo.getPosicaoX() < 0){
                    robo.setPosicaoX(0);
                }
                viewRobo.setTranslateX(robo.getPosicaoX());
                viewRobo.setTranslateY(robo.getPosicaoY());
            }
            if (evt.getCode() == KeyCode.RIGHT) {
                viewRobo.setImage(imgRoboDir);
                robo.setPosicaoX(robo.getPosicaoX() + (int)robo.getVelocidade());
                if (robo.getPosicaoX() + robo.getLargura() > mundo.DIM_X){
                    robo.setPosicaoX(mundo.DIM_X - robo.getLargura());
                }
                viewRobo.setTranslateX(robo.getPosicaoX());
                viewRobo.setTranslateY(robo.getPosicaoY());
            }
            if (evt.getCode() == KeyCode.SPACE) {
                if (robo.getVelocidade() == 1){
                    robo.setVelocidade(5);
                }else {
                    robo.setVelocidade(1);
                }
            }
        });
    }
}
