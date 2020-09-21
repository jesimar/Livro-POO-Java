package code.unidade3.secao1.sp.simulator.core;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.11
 */
public class Robo extends RoboIdeia {

    private final float velocidadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";

    public static final int FRENTE = 0;
    public static final int ATRAS = 1;
    public static final int ESQUERDA = 2;
    public static final int DIREITA = 3;

    public Robo() {
        super.nome = "R-ATM";
        super.peso = 70;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }

    public Robo(String nome) {
        super.nome = nome;
        super.peso = 70;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }

    public Robo(String nome, float peso) {
        super.nome = nome;
        super.peso = peso;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }

    public Robo(String nome, float peso, float posX, float posY) {
        super.nome = nome;
        super.peso = peso;
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    @Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY)
                || Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Argumentos não válidos");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Argumento não válido");
        }
        super.posicaoX += dist;
    }

    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Argumento não válido");
        }
        super.posicaoY += dist;
    }

    public void setOrientacao(char tecla) {
        if (tecla == 'w') {
            super.orientacao = FRENTE;
            moveY(5);
        } else if (tecla == 's') {
            super.orientacao = ATRAS;
            moveY(-5);
        } else if (tecla == 'a') {
            super.orientacao = ESQUERDA;
            moveX(-5);
        } else if (tecla == 'd') {
            super.orientacao = DIREITA;
            moveX(5);
        } else {
            throw new IllegalArgumentException("Argumento não válido");
        }
    }

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

    public void printPos() {
        System.out.println("(x, y) = (" + posicaoX + ", " + posicaoY + ")");
    }

    @Override
    public String toString() {
        return "Robo{" + "posicaoX=" + posicaoX + ", posicaoY=" + posicaoY
                + ", orientacao=" + orientacao + '}';
    }

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
