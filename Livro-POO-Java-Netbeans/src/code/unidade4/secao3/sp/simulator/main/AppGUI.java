package code.unidade4.secao3.sp.simulator.main;

import code.unidade4.secao3.sp.simulator.core.Caixa;
import code.unidade4.secao3.sp.simulator.core.Mundo2D;
import code.unidade4.secao3.sp.simulator.core.Robo;
import code.unidade4.secao3.sp.simulator.core.Carregador;
import code.unidade4.secao3.sp.simulator.bd.ConexaoBD;
import code.unidade4.secao3.sp.simulator.bd.Consultas;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import java.sql.Connection;

/**
 *
 * @author jesimar
 */
public class AppGUI extends Application {

    private final String IMG_FUNDO = "recursos/galpao.png";
    private final String IMG_FRENTE = "recursos/robo1.png";
    private final String IMG_COSTAS = "recursos/robo2.png";
    private final String IMG_ESQ = "recursos/robo3.png";
    private final String IMG_DIR = "recursos/robo4.png";
    private final String IMG_BOX_LVR = "recursos/box.png";
    private final String IMG_BOX_HD = "recursos/box2.png";
    private final String IMG_BOX_PRT = "recursos/box3.png";
    private final String IMG_CARREGADOR = "recursos/Carregador.png";

    private final Image imgFundo = new Image(getClass().getResourceAsStream(IMG_FUNDO));
    private final Image imgRoboFrente = new Image(getClass().getResourceAsStream(IMG_FRENTE));
    private final Image imgRoboCostas = new Image(getClass().getResourceAsStream(IMG_COSTAS));
    private final Image imgRoboEsq = new Image(getClass().getResourceAsStream(IMG_ESQ));
    private final Image imgRoboDir = new Image(getClass().getResourceAsStream(IMG_DIR));
    private final Image imgBoxLvr = new Image(getClass().getResourceAsStream(IMG_BOX_LVR));
    private final Image imgBoxHd = new Image(getClass().getResourceAsStream(IMG_BOX_HD));
    private final Image imgBoxPrt = new Image(getClass().getResourceAsStream(IMG_BOX_PRT));
    private final Image imgCarregador = new Image(getClass().getResourceAsStream(IMG_CARREGADOR));
    
    private final int numCaixaLvr = 3;
    private final int numCaixaHd = 3;
    private final int numCaixaHdPrateleira = 2;
    private final int numCaixaPtr = 3;
    private final ImageView viewFundo = new ImageView(imgFundo);
    private final ImageView viewRobo = new ImageView(imgRoboFrente);
    private final ImageView viewBoxLvr[] = new ImageView[numCaixaLvr];
    private final ImageView viewBoxPrt[] = new ImageView[numCaixaPtr];
    private final ImageView viewBoxHd[][] = new ImageView[numCaixaHdPrateleira][numCaixaHd];
    private final ImageView viewCarregador = new ImageView(imgCarregador);
    
    private final Mundo2D mundo = new Mundo2D(600, 400);
    private final Robo robo = new Robo(32, 300);
    private final Carregador carregador = new Carregador(250, 270, viewCarregador);
    private final Caixa caixaLvr[] = new Caixa[numCaixaLvr];
    private final Caixa caixaPrt[] = new Caixa[numCaixaPtr];
    private final Caixa caixaHd[][] = new Caixa[numCaixaHdPrateleira][numCaixaHd];

    private final ConexaoBD conBD = new ConexaoBD();
    private final Connection connection = conBD.getConexao();        
    private final Consultas consultas = new Consultas();
    
    public static void main(String[] args) {
        if (args.length != 0) {
            args[0] = args[0].toLowerCase();
            if (args[0].equals("--author")
                    || args[0].equals("-a")) {
                System.out.println("Autor: Jesimar da Silva Arantes");
            } else if (args[0].equals("--version")
                    || args[0].equals("-v")) {
                System.out.println("Versão: 1.0.0");
            } else if (args[0].equals("--commands")
                    || args[0].equals("-c")) {
                System.out.println("Comandos suportados:");
                System.out.println("\tseta para cima: move para cima");
                System.out.println("\tseta para esquerda: move para esquerda");
                System.out.println("\tseta para baixo: move para baixo");
                System.out.println("\tseta para direita: move para direita");
            } else {
                System.out.println("Argumento não válido");
            }
            System.exit(0);
        }
        
        launch(args);
    }

    @Override
    public void start(Stage janela) {
        viewFundo.setTranslateX(0);
        viewFundo.setTranslateY(0);
        
        Thread threadCarregador = new Thread(carregador);
        threadCarregador.start();

        for (int i = 0; i < caixaLvr.length; i++) {
            caixaLvr[i] = new Caixa("Caixa de Livros", 15, 25, 50 + i * 50,
                    30, 0.40f, 0.40f, 0.30f);
            viewBoxLvr[i] = new ImageView(imgBoxLvr);
            viewBoxLvr[i].setTranslateX(caixaLvr[i].getPosX());
            viewBoxLvr[i].setTranslateY(caixaLvr[i].getPosY());
        }
        for (int i = 0; i < caixaPrt.length; i++) {
            caixaPrt[i] = new Caixa("Caixa de Impressoras", 8, 525, 50 + i * 50,
                    40, 0.60f, 0.60f, 0.40f);
            viewBoxPrt[i] = new ImageView(imgBoxPrt);
            viewBoxPrt[i].setTranslateX(caixaPrt[i].getPosX());
            viewBoxPrt[i].setTranslateY(caixaPrt[i].getPosY());
        }
        for (int i = 0; i < caixaHd.length; i++) {
            for (int j = 0; j < caixaHd[i].length; j++) {
                if (i == 0) {
                    caixaHd[i][j] = new Caixa("Caixa de HDs", 20, 230 + j * 50, 50,
                            40, 0.50f, 0.50f, 0.30f);
                } else {
                    caixaHd[i][j] = new Caixa("Caixa de HDs", 20, 230 + j * 50, 160,
                            40, 0.50f, 0.50f, 0.30f);
                }
                viewBoxHd[i][j] = new ImageView(imgBoxHd);
                viewBoxHd[i][j].setTranslateX(caixaHd[i][j].getPosX());
                viewBoxHd[i][j].setTranslateY(caixaHd[i][j].getPosY());
            }
        }

        viewRobo.setTranslateX(robo.getPosicaoX());
        viewRobo.setTranslateY(robo.getPosicaoY());

        Group grupo = new Group();
        grupo.getChildren().add(viewFundo);
        grupo.getChildren().add(viewCarregador);
        for (int i = 0; i < viewBoxLvr.length; i++) {
            grupo.getChildren().add(viewBoxLvr[i]);
        }
        for (int i = 0; i < viewBoxPrt.length; i++) {
            grupo.getChildren().add(viewBoxPrt[i]);
        }
        for (int i = 0; i < viewBoxHd.length; i++) {
            for (int j = 0; j < viewBoxHd[i].length; j++) {
                grupo.getChildren().add(viewBoxHd[i][j]);
            }
        }
        grupo.getChildren().add(viewRobo);

        Scene cena = new Scene(grupo, mundo.DIM_X, mundo.DIM_Y);

        janela.setTitle("Simulador de Robótica");
        janela.setScene(cena);
        janela.show();

        cena.setOnKeyPressed((evt) -> {
            if (evt.getCode() == KeyCode.UP) {
                viewRobo.setImage(imgRoboCostas);
                if (robo.avaliaPosicao(robo.getPosicaoX(),
                        robo.getPosicaoY() - (int) robo.getVelocidade())) {
                    robo.setPosicaoY(robo.getPosicaoY() - (int) robo.getVelocidade());
                    viewRobo.setTranslateX(robo.getPosicaoX());
                    viewRobo.setTranslateY(robo.getPosicaoY());
                    consultas.inserirPos(connection, robo.getPosicaoX(), 
                            robo.getPosicaoY());
                }
            }
            if (evt.getCode() == KeyCode.DOWN) {
                viewRobo.setImage(imgRoboFrente);
                if (robo.avaliaPosicao(robo.getPosicaoX(),
                        robo.getPosicaoY() + (int) robo.getVelocidade())) {
                    robo.setPosicaoY(robo.getPosicaoY() + (int) robo.getVelocidade());
                    viewRobo.setTranslateX(robo.getPosicaoX());
                    viewRobo.setTranslateY(robo.getPosicaoY());
                    consultas.inserirPos(connection, robo.getPosicaoX(), 
                            robo.getPosicaoY());
                }
            }
            if (evt.getCode() == KeyCode.LEFT) {
                viewRobo.setImage(imgRoboEsq);
                if (robo.avaliaPosicao(robo.getPosicaoX() - (int) robo.getVelocidade(),
                        robo.getPosicaoY())) {
                    robo.setPosicaoX(robo.getPosicaoX() - (int) robo.getVelocidade());
                    viewRobo.setTranslateX(robo.getPosicaoX());
                    viewRobo.setTranslateY(robo.getPosicaoY());
                    consultas.inserirPos(connection, robo.getPosicaoX(), 
                            robo.getPosicaoY());
                }
            }
            if (evt.getCode() == KeyCode.RIGHT) {
                viewRobo.setImage(imgRoboDir);
                if (robo.avaliaPosicao(robo.getPosicaoX() + (int) robo.getVelocidade(),
                        robo.getPosicaoY())) {
                    robo.setPosicaoX(robo.getPosicaoX() + (int) robo.getVelocidade());
                    viewRobo.setTranslateX(robo.getPosicaoX());
                    viewRobo.setTranslateY(robo.getPosicaoY());
                    consultas.inserirPos(connection, robo.getPosicaoX(), 
                            robo.getPosicaoY());
                }
            }
            if (evt.getCode() == KeyCode.SPACE) {
                if (robo.getVelocidade() == 1) {
                    robo.setVelocidade(5);
                } else {
                    robo.setVelocidade(1);
                }
            }
        });
    }
}
