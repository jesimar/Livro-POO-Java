package code.unidade1.secao1.ex2;

/**
 *
 * @author Jesimar da Silva Arantes
 */
public class Robo {
    String nome;
    String cor;
    float velocidadeMax;
    int nivelBateriaAtual;
    float pesoCargaMax;
    String tipoTracao;
    boolean temAntena;
    
    public static void main(String[] args) {
        Robo obj1 = new Robo();
        obj1.nome = "R-801";
        obj1.cor = "azul";
        obj1.velocidadeMax = 6;
        obj1.nivelBateriaAtual = 78;
        obj1.pesoCargaMax = 10;
        obj1.tipoTracao = "esteira";
        obj1.temAntena = true;
        
        System.out.println("Meu nome: " + obj1.nome );
        System.out.println("Cor do Robô: " + obj1.cor);
        System.out.println("Vel Max: " + obj1.velocidadeMax);
        System.out.println("Bat: " + obj1.nivelBateriaAtual);
        System.out.println("Carga Max: " + obj1.pesoCargaMax);
        System.out.println("Tipo Tração: " + obj1.tipoTracao);
        System.out.println("Tem Antena: " + obj1.temAntena);
    }
}

