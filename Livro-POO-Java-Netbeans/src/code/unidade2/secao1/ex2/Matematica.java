package code.unidade2.secao1.ex2;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Matematica {
    static final double PI  = 3.1415926535;
    static final double E   = 2.7182818284;
    static final double PHI = 1.6180339887;
    
    static int soma(int a, int b){
        return a + b;
    }
    
    static int mult(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println("Numero Pi: " + Matematica.PI);
        System.out.println("Numero E: " + Matematica.E);
        System.out.println("Numero Phi: " + Matematica.PHI);
        System.out.println("Soma: " + Matematica.soma(5, 3));
        System.out.println("Multiplicação: " + Matematica.mult(5, 3));
    }
}
