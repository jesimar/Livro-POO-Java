public class Robo3 {
    String nome = "R-ATM";
    float peso = 70;
    float velocidadeMax = 5;
    float pesoCargaMax = 20;
    String tipoTracao = "esteira";
    float posicaoX = 50;
    float posicaoY = 50;
    
    public void move(float x, float y){
        posicaoX = x;
        posicaoY = y;
    }
    
    public void printStatus(){
        System.out.println("-----------Info R-ATM----------");
        System.out.println("Nome do Robô: " + nome);
        System.out.println("Peso do Robô: " + peso);
        System.out.println("Velocidade Max: " + velocidadeMax);
        System.out.println("Carga Max do Robô: " + pesoCargaMax);
        System.out.println("Tipo Tração do Robô: " + tipoTracao);
        System.out.println("Posição X do Robô: " + posicaoX);
        System.out.println("Posição Y do Robô: " + posicaoY);
        System.out.println("-------------------------------");
    }
    
    public static void main(String[] args) {
        Robo3 objRobo = new Robo3();
        objRobo.printStatus();
        objRobo.move(60, 50);
        objRobo.printStatus();
        objRobo.move(65, 55);
        objRobo.printStatus();
    }
}
