package code.unidade3.secao3.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Jesimar S. Arantes
 * Código 3.27
 */
public class AppGraficos extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage janela) {
        int dimx = 1000;
        int dimy = 440;
        BarChart bar = new BarChart<>(new CategoryAxis(), new NumberAxis());
        bar.setTitle("Relação de Vendas de Carros Por Ano");
        
        XYChart.Series carro1 = new XYChart.Series();
        carro1.setName("Chevrolet Onix");
        carro1.getData().add(new XYChart.Data("2017", 188654));
        carro1.getData().add(new XYChart.Data("2018", 210466));
        carro1.getData().add(new XYChart.Data("2019", 241214));
        carro1.getData().add(new XYChart.Data("2020", 17463));

        XYChart.Series carro2 = new XYChart.Series();
        carro2.setName("Hyundai HB20");
        carro2.getData().add(new XYChart.Data("2017", 105539));
        carro2.getData().add(new XYChart.Data("2018", 105518));
        carro2.getData().add(new XYChart.Data("2019", 101590));
        carro2.getData().add(new XYChart.Data("2020", 6555));

        XYChart.Series carro3 = new XYChart.Series();
        carro3.setName("Ford Ka");
        carro3.getData().add(new XYChart.Data("2017", 94893));
        carro3.getData().add(new XYChart.Data("2018", 104450));
        carro3.getData().add(new XYChart.Data("2019", 104331));
        carro3.getData().add(new XYChart.Data("2020", 7334));

        bar.getData().addAll(carro1, carro2, carro3);
        bar.setPrefSize(dimx/2 - 20, dimy - 20);
        
        PieChart graficoPizza = new PieChart();
        graficoPizza.setTitle("Relação Consumo Energia por Dia da Semana");
        graficoPizza.getData().addAll(
                new PieChart.Data("Domingo", 18),
                new PieChart.Data("Segunda", 38),
                new PieChart.Data("Terça", 34),
                new PieChart.Data("Quarta", 35),
                new PieChart.Data("Quinta", 31),
                new PieChart.Data("Sexta", 36),
                new PieChart.Data("Sábado", 27));
        graficoPizza.setPrefSize(dimx/2 - 20, dimy - 20);

        HBox hbox = new HBox(bar, graficoPizza);
        Scene cena = new Scene(hbox, dimx, dimy);

        janela.setTitle("Aplicação Exibe Gráficos");
        janela.setScene(cena);
        janela.show();
    }
}
