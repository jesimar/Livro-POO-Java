package code.unidade3.secao2.ex1;

/**
 *
 * @author jesimar
 */
public class ExemploVarargs {
    public static void main(String[] args) {
        System.out.println(soma());
        System.out.println(soma(6));
        System.out.println(soma(1, 6));
        System.out.println(soma(3, 5, 4));
        System.out.println(soma(2, 7, 4, 8));
        System.out.println(soma(5, 6, 9, 1, 8));
        int vet[] = {1, 2};
        System.out.println(soma(vet));
    }
    
    public static int soma(int... args){
        int valorDaSoma = 0;
        for (int valor : args){
            valorDaSoma += valor;
        }
        return valorDaSoma;
    }
    
//    public static int soma(int a, int b){
//        return a + b;
//    }
//    
//    public static int soma(int a, int b, int c){
//        return a + b + c;
//    }
//    
//    public static int soma(int a, int b, int c, int d){
//        return a + b + c + d;
//    }
}
