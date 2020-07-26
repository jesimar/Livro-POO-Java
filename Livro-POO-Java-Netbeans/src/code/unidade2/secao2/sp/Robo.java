package code.unidade2.secao2.sp;

/**
 *
 * @author Jesimar da Silva Arantes
 */
public class Robo {
    float posicaoX;
    float posicaoY;
    int orientacao;
    final String nome;
    final float peso;
    final float velocidadeMax = 5;
    final float pesoCargaMax = 20;
    final String tipoTracao = "esteira";
    
    static final int FRENTE = 0;
    static final int ATRAS = 1;
    static final int ESQUERDA = 2;
    static final int DIREITA = 3;
    
    public Robo() {
        this.nome = "R-ATM";
        this.peso = 70;
        this.posicaoX = 50;
        this.posicaoY = 50;
    }
    
    public Robo(String nome) {
        this.nome = nome;
        this.peso = 70;
        this.posicaoX = 50;
        this.posicaoY = 50;
    }
    
    public Robo(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = 50;
        this.posicaoY = 50;
    }
    
    public Robo(String nome, float peso, float posX, float posY) {
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = posX;
        this.posicaoY = posY;
    }
    
    public void move(float pos){
        this.posicaoY = pos;
    }
    
    public void move(float posX, float posY){
        this.posicaoX = posX;
        this.posicaoY = posY;
    }
    
    public void moveX(float dist){
        this.posicaoX += dist;
    }
    
    public void moveY(float dist){
        this.posicaoY += dist;
    }
    
    public void setOrientacao(char tecla){
        if (tecla == 'w'){
            this.orientacao = FRENTE;
        }else if (tecla == 's'){
            this.orientacao = ATRAS;
        }else if (tecla == 'a'){
            this.orientacao = ESQUERDA;
        }else if (tecla == 'd'){
            this.orientacao = DIREITA;
        }
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
    
    public void printPos(){
        System.out.println("(x, y) = (" + posicaoX + ", " + posicaoY + ")");
    }
}
