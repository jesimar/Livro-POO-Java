package code.unidade4.secao1.ap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Jesimar da Silva Arantes
 * Código Aula Prática
 */
public class AppGraficosStrings extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage janela) {
        long media[] = AnaliseDeStrings.executaTodasAsAnalisesStrings();
        int dimx = 600;
        int dimy = 440;
        BarChart bar = new BarChart<>(new CategoryAxis(), new NumberAxis());
        bar.setTitle("Comparação entre Manipuladores de Strings");
        
        XYChart.Series strings = new XYChart.Series();
        strings.setName("Manipuladores Strings");
//        strings.getData().add(new XYChart.Data("StringPlus", media[0]));
        strings.getData().add(new XYChart.Data("StringConcat", media[0]));
        strings.getData().add(new XYChart.Data("StringBuilder", media[1]));
        strings.getData().add(new XYChart.Data("StringBuffer", media[2]));

        bar.getData().addAll(strings);
        bar.setPrefSize(dimx - 20, dimy - 20);
   
        HBox hbox = new HBox(bar);
        Scene cena = new Scene(hbox, dimx, dimy);

        janela.setTitle("Aplicação Compara Strings");
        janela.setScene(cena);
        janela.show();
    }
}
