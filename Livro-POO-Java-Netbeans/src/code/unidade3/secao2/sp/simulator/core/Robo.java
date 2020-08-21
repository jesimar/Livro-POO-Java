package code.unidade3.secao2.sp.simulator.core;

/**
 * Classe que modela a entidade robô
 * @author Jesimar da Silva Arantes
 */
public class Robo extends RoboIdeia {

    private final float velocidadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";

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
            moveY(5);
        } else if (tecla == 's') {
            super.orientacao = Orientacao.ATRAS;
            moveY(-5);
        } else if (tecla == 'a') {
            super.orientacao = Orientacao.ESQUERDA;
            moveX(-5);
        } else if (tecla == 'd') {
            super.orientacao = Orientacao.DIREITA;
            moveX(5);
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
}
