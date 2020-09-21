package code.unidade3.secao1.ap;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Jesimar da Silva Arantes
 * Código: Aula Prática
 */
public class AulaPratica {
    
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        //Locale.setDefault(new Locale("en", "US"));
        double a = 0;
        double b = 0;
        double c = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número real 'a': ");
        boolean ok;
        do{
            try{
                a = scan.nextDouble();
                System.out.printf("a = %f%n", a);
                ok = true;
            }catch (InputMismatchException ex){
                System.out.println("Valor errado digite um número inteiro novamente");
                scan.nextLine();
                ok = false;
            }
        }while(!ok);
        
        System.out.print("Digite um número real 'b': ");
        do{
            try{
                b = scan.nextDouble();
                System.out.printf("b = %f%n", b);
                ok = true;
            }catch (InputMismatchException ex){
                System.out.println("Valor errado digite um número inteiro novamente");
                scan.nextLine();
                ok = false;
            }
        }while(!ok);
        
        System.out.print("Digite um número real 'c': ");
        do{
            try{
                c = scan.nextDouble();
                System.out.printf("c = %f%n", c);
                ok = true;
            }catch (InputMismatchException ex){
                System.out.println("Valor errado digite um número inteiro novamente");
                scan.nextLine();
                ok = false;
            }
        }while(!ok);
        
        try{
            double x1 = Equacao.raizEq2GrauX1_RT(a, b, c);
            double x2 = Equacao.raizEq2GrauX2_RT(a, b, c);
            System.out.printf("x1: %f%n", x1);
            System.out.printf("x2: %f%n", x2);
        }catch (NaoTemRaizesReaisRuntimeException ex){
            System.out.printf("x1: %s%n", "delta negativo sem raizes reais");
            System.out.printf("x2: %s%n", "delta negativo sem raizes reais");
        }  
    }
}
