package code.unidade4.secao1.sp.simulator.core;

/**
 * Classe que modela a entidade robô
 * @author Jesimar da Silva Arantes
 * Código 4.6
 */
public class Robo extends RoboIdeia {
    
    private float velocidade = 1;
    private final float velocidadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";
    private final int altura = 60;
    private final int largura = 64;

    /**
     * Construtor padrão da aplicação.
     */
    public Robo() {
        super.nome = "R-ATM";
        super.peso = 70;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }

    /**
     * Construtor da classe robô
     * @param nome nome do robô.
     */
    public Robo(String nome) {
        super.nome = nome;
        super.peso = 70;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }

    /**
     * Construtor da classe robô
     * @param nome nome do robô.
     * @param peso valor do peso do robô.
     */
    public Robo(String nome, float peso) {
        super.nome = nome;
        super.peso = peso;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }
    
    /**
     * Construtor da classe robô
     * @param posX valor da posição x inicial do robô.
     * @param posY valor da posição y inicial do robô.
     */
    public Robo(float posX, float posY) {
        super.nome = "R-ATM";
        super.peso = 70;
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    /**
     * Construtor da classe robô
     * @param nome nome do robô.
     * @param peso valor do peso do robô.
     * @param posX valor da posição x inicial do robô.
     * @param posY valor da posição y inicial do robô.
     */
    public Robo(String nome, float peso, float posX, float posY) {
        super.nome = nome;
        super.peso = peso;
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    /**
     * Move o robô para a posição x e y.
     * @param posX posição x em que o robô será movido.
     * @param posY posição y em que o robô será movido.
     * @throws IllegalArgumentException exceção lançada quando o argumento for NaN ou infinita
     */
    @Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY)
                || Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Argumentos não válidos");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    /**
     * Move o robô ao longo do eixo x.
     * @param dist distância a partir da posição atual no eixo x que será movido o robô. 
     * @throws IllegalArgumentException exceção lançada quando o argumento for NaN ou infinito
     */
    @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Argumento não válido");
        }
        super.posicaoX += dist;
    }

    /**
     * Move o robô ao longo do eixo y.
     * @param dist distância a partir da posição atual no eixo y que será movido o robô.
     * @throws IllegalArgumentException exceção lançada quando o argumento for NaN ou infinito
     */
    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Argumento não válido");
        }
        super.posicaoY += dist;
    }

    /**
     * Método que define a orientação do robô e também efetua o movimento na 
     * direção da orientação que a tecla foi precionada.
     * @param tecla char representando a tecla que foi precionada.
     */
    public void setOrientacao(char tecla) {
        if (tecla == 'w') {
            super.orientacao = Orientacao.FRENTE;
            moveY(velocidade);
        } else if (tecla == 's') {
            super.orientacao = Orientacao.ATRAS;
            moveY(-velocidade);
        } else if (tecla == 'a') {
            super.orientacao = Orientacao.ESQUERDA;
            moveX(-velocidade);
        } else if (tecla == 'd') {
            super.orientacao = Orientacao.DIREITA;
            moveX(velocidade);
        } else {
            throw new IllegalArgumentException("Argumento não válido");
        }
    }
    
    public void movimentosAgendados(String... moves){
        for (String tecla : moves){
            if ((!tecla.equals("--move") && !tecla.equals("-m"))){
                System.out.println("Tecla: " + tecla);
                System.out.println("Descrição: " + descricaoDoMovimento(tecla.charAt(0)));
                setOrientacao(tecla.charAt(0));
                printPos();
            }
        }
    }
    
    public String descricaoDoMovimento(char tecla){
        if (tecla == 'w'){
            return "Movendo para frente";
        } else if (tecla == 'a'){
            return "Movendo para esquerda";
        } else if (tecla == 's'){
            return "Movendo para baixo";
        } else if (tecla == 'd'){
            return "Movendo para direita";
        } else {
            return "";
        }
    }
    
    public boolean avaliaPosicao(int posX, int posY){
        posX = posX + largura/2;
        posY = posY + altura/2;
        if (posX < 40 || posX > 560 || posY < 30 || posY > 360){
            return false;//delimitaçao da fronteira da sala/galpao
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 240 && posY <= 400)){
            return false;//delimitaçao da regiao de operaçao de maquinas
        }
        if ((posX >= 0 && posX <= 100) && (posY >= 0 && posY <= 200)){
            return false;//delimitaçao da regiao de caixas com livros 
        }
        if ((posX >= 500 && posX <= 600) && (posY >= 0 && posY <= 200)){
            return false;//delimitaçao da regiao de caixas com impressoras
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 0 && posY <= 90)){
            return false;//delimitaçao da regiao de caixas com HDs acima
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 120 && posY <= 200)){
            return false;//delimitaçao da regiao de caixas com HDs abaixo
        }
        return true;
    }
    
    /**
     * Método que imprime todos os estados internos do objeto. 
     */
    public void printStatus() {
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

    /**
     * Método que imprime a posição corrente do objeto.
     */
    public void printPos() {
        System.out.println("(x, y) = (" + posicaoX + ", " + posicaoY + ")");
    }

    /**
     * Método que imprime o estado do objeto.
     * @return retorna uma string que representa o estado do objeto.
     */
    @Override
    public String toString() {
        return "Robo{" + "posicaoX=" + posicaoX + ", posicaoY=" + posicaoY
                + ", orientacao=" + orientacao + '}';
    }

    /**
     * Método que compara dois objetos.
     * @param obj objeto a ser comparado.
     * @return retorna true se os dois objetos são iguais e retorna false se forem diferentes.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Robo) {
            Robo robo = (Robo) obj;
            return super.nome.equals(robo.nome);
        } else {
            return false;
        }
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }   
    
    public int getPosicaoX() {
        return (int)this.posicaoX;
    }

    public int getPosicaoY() {
        return (int)this.posicaoY;
    }

    public void setPosicaoX(float posicaoX) {
        this.posicaoX = posicaoX;
    }

    public void setPosicaoY(float posicaoY) {
        this.posicaoY = posicaoY;
    }
    
}
