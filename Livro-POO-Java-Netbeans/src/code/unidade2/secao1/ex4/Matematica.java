package code.unidade2.secao1.ex4;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Matematica {
    
    static int soma(int a, int b){
        return a + b;
    }
    
    static double soma(double a, double b){
        return a + b;
    }
    
    static double soma(double a, double b, double c){
        return a + b + c;
    }
    
    static int mult(int a, int b){
        return a * b;
    }
    
    static double mult(double a, double b){
        return a * b;
    }
    
    static double mult(double a, double b, double c){
        return a * b * c;
    }
    
    public static void main(String[] args) {
        System.out.println("Soma: " + Matematica.soma(5, 3));
        System.out.println("Soma: " + Matematica.soma(1.4, 2));
        System.out.println("Soma: " + Matematica.soma(2, 3.5));
        System.out.println("Soma: " + Matematica.soma(3.2, 4.1));
        System.out.println("Soma: " + Matematica.soma(4.5, 5.2, 2));
        System.out.println("Multiplicação: " + Matematica.mult(5, 3));
        System.out.println("Multiplicação: " + Matematica.mult(3.2, 4.1));
        System.out.println("Multiplicação: " + Matematica.mult(1.4, 2));
        System.out.println("Multiplicação: " + Matematica.mult(2, 3.5));
        System.out.println("Multiplicação: " + Matematica.mult(4.5, 5.2, 2));
    }
}
