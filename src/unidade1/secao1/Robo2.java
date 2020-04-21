public class Robo2 {
    String nome;
    String cor;
    float velocidadeMax;
    int nivelBateriaAtual;
    float pesoCargaMax;
    String tipoTracao;
    boolean temAntena;
    
    public void printStatus(){
        System.out.println("-------------------------------");
        System.out.println("Meu nome: " + nome);
        System.out.println("Cor do Robô: " + cor);
        System.out.println("Velocidade Max: " + velocidadeMax);
        System.out.println("Bateria: " + nivelBateriaAtual);
        System.out.println("Carga Max: " + pesoCargaMax);
        System.out.println("Tipo de Tração: " + tipoTracao);
        System.out.println("Tem Antena: " + temAntena);
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        Robo2 objeto1 = new Robo2();
        objeto1.nome = "R-801";
        objeto1.cor = "azul";
        objeto1.velocidadeMax = 6;
        objeto1.nivelBateriaAtual = 78;
        objeto1.pesoCargaMax = 10;
        objeto1.tipoTracao = "esteira";
        objeto1.temAntena = true;
        objeto1.printStatus();
        
        Robo2 objeto2 = new Robo2();
        objeto2.nome = "R-701";
        objeto2.cor = "laranja";
        objeto2.velocidadeMax = 3;
        objeto2.nivelBateriaAtual = 51;
        objeto2.pesoCargaMax = 15;
        objeto2.tipoTracao = "esteira";
        objeto2.temAntena = false;
        objeto2.printStatus();
    }
}
