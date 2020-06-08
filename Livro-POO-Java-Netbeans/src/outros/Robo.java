package outros;

/**
 *
 * @author Jesimar da Silva Arantes
 */
public class Robo {
    String nome = "R-ATM";
    float peso = 70;
    float velocidadeMax = 5;
    float pesoCargaMax = 20;
    String tipoTracao = "esteira";
    float posicaoX;
    float posicaoY;
    
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
        Robo objRobo = new Robo();
        objRobo.posicaoX = Float.parseFloat(args[0]);
        objRobo.posicaoY = Float.parseFloat(args[1]);
        objRobo.printStatus();
        objRobo.move(60, 50);
        objRobo.printStatus();
        objRobo.move(65, 55);
        objRobo.printStatus();
    }
}
