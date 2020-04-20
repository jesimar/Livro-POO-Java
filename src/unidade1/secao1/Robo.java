public class Robo {
    String nome;
    String cor;
    float velocidade_max;
    int nivel_bateria_atual;
    float peso_carga_max;
    String tipo_tracao;
    boolean tem_antena;
    public static void main(String[] args) {
        Robo obj1 = new Robo();
        obj1.nome = "R-801";
        obj1.cor = "azul";
        obj1.velocidade_max = 6;
        obj1.nivel_bateria_atual = 78;
        obj1.peso_carga_max = 10;
        obj1.tipo_tracao = "esteira";
        obj1.tem_antena = true;
        System.out.println("Meu nome: " + obj1.nome );
        System.out.println("Cor do Robô: " + obj1.cor);
        System.out.println("Vel Max: " + obj1.velocidade_max);
        System.out.println("Bat: " + obj1.nivel_bateria_atual);
        System.out.println("Carga Max: " + obj1.peso_carga_max);
        System.out.println("Tipo Tração: " + obj1.tipo_tracao);
        System.out.println("Tem Antena: " + obj1.tem_antena);
    }
}
