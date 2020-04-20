public class Robo2 {
    String nome;
    String cor;
    float velocidade_max;
    int nivel_bateria_atual;
    float peso_carga_max;
    String tipo_tracao;
    boolean tem_antena;
    public void printStatus(){
        System.out.println("-------------------------------");
        System.out.println("Meu nome: " + nome);
        System.out.println("Cor do Robô: " + cor);
        System.out.println("Velocidade Max: " + velocidade_max);
        System.out.println("Bateria: " + nivel_bateria_atual);
        System.out.println("Carga Max: " + peso_carga_max);
        System.out.println("Tipo de Tração: " + tipo_tracao);
        System.out.println("Tem Antena: " + tem_antena);
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        Robo2 objeto1 = new Robo2();
        objeto1.nome = "R-801";
        objeto1.cor = "azul";
        objeto1.velocidade_max = 6;
        objeto1.nivel_bateria_atual = 78;
        objeto1.peso_carga_max = 10;
        objeto1.tipo_tracao = "esteira";
        objeto1.tem_antena = true;
        objeto1.printStatus();
        Robo2 objeto2 = new Robo2();
        objeto2.nome = "R-701";
        objeto2.cor = "laranja";
        objeto2.velocidade_max = 3;
        objeto2.nivel_bateria_atual = 51;
        objeto2.peso_carga_max = 15;
        objeto2.tipo_tracao = "esteira";
        objeto2.tem_antena = false;
        objeto2.printStatus();
    }
}
