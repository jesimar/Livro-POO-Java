package src.unidade2.secao1.ex1;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Matematica {
    double PI  = 3.1415926535;
    double E   = 2.7182818284;
    double PHI = 1.6180339887;
    
    int soma(int a, int b){
        return a + b;
    }
    
    int mult(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Matematica mat = new Matematica();
        System.out.println("Numero Pi: " + mat.PI);
        System.out.println("Numero E: " + mat.E);
        System.out.println("Numero Phi: " + mat.PHI);
        System.out.println("Soma: " + mat.soma(5, 3));
        System.out.println("Multiplicação: " + mat.mult(5, 3));
    }
}
