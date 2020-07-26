package code.unidade3.secao1.ex2;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Matematica {
    
    public static int soma(int a, int b){
        return a + b;
    }
    
    public static double soma(double a, double b){
        return a + b;
    }
    
    public static int sub(int a, int b){
        return a - b;
    }
    
    public static double sub(double a, double b){
        return a - b;
    }
    
    public static int mult(int a, int b){
        return a * b;
    }
    
    public static double mult(double a, double b){
        return a * b;
    }
    
    public static int div(int a, int b){
        try {
            return a / b;
        }catch (ArithmeticException ex){
            System.err.println("A divisão por zero é indefinida");
            System.err.println(ex);
            return 0;
        }
    }
    
    public static double div(double a, double b){
        return a / b;
    }
    
    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O valor de n deve ser >= 0");
        }
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
    
    public static long fatorial2(int n) {
        if (n < 0) {
            throw new ValorNegativoException("Valor negativo passado como parâmetro");
        }
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
    
    public static int exceptionChecked(int n) throws Exception{
        if (n < 0) {
            throw new Exception("O valor de n deve ser >= 0");
        }
        return 0;
    }
    
    public static void printFatorial2(int n) throws IllegalArgumentException{
        long fat = fatorial(n);
        System.out.println("fat: " + fat);
    }
    
    public static void printFatorial(int n) {
        try{
            long fat = fatorial(n);
            System.out.println("fat: " + fat);
        }catch (IllegalArgumentException ex){
            System.out.println("Valor negativo");
        }
    }
    
    public static void main(String[] args) {
        
            //        System.out.println("Divisão: " + div(20, 5));
//        System.out.println("Divisão: " + div(5, 0));
//        System.out.println("Soma: " + soma(5, 3));
//        System.out.println("Soma: " + soma(1.4, 2));
//        System.out.println("Soma: " + soma(2, 3.5));
//        System.out.println("Soma: " + soma(3.2, 4.1));
//        System.out.println("Multiplicação: " + mult(5, 3));
//        System.out.println("Multiplicação: " + mult(3.2, 4.1));
//        System.out.println("Multiplicação: " + mult(1.4, 2));
//        System.out.println("Multiplicação: " + mult(2, 3.5));  
//        try{
//            printFatorial2(-1);
//        }catch (IllegalArgumentException ex){
//            System.out.println("Valor negativo: " + ex);
//        }
        try {
            long fat = fatorial2(-1);
            System.out.println("fat: " + fat);
        } catch (ValorNegativoException e) {
            System.out.println("ex: " + e);
        }
           
//        try{
//            exceptionChecked(-1);
//        } catch (Exception ex) {
//            System.out.println("ex: " + ex);
//        } catch (Throwable ex) {
//            Logger.getLogger(Matematica.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
