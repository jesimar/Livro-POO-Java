package code.unidade3.secao1.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jesimar
 */
public class LancarExceptions {
    public static void main(String[] args) {
        int divPor0a = 5/0;
        try{
            int divPor0 = 5/0;
            System.out.println("Divisão por 0: " + divPor0);
        }catch (ArithmeticException ex){
            System.out.println("ex: " + ex);
        }
        
        try{
            int valorString = Integer.parseInt("A");
            System.out.println("Valor String para Inteiro: " + valorString);
        }catch (NumberFormatException ex){
            System.out.println("ex: " + ex);
        }
        
        try{
            float refNull = Float.parseFloat(null);
            System.out.println("Valor Referência Null: " + refNull);
        }catch (NullPointerException ex){
            System.out.println("ex: " + ex);
        }
        
        try{
            String indiceForaIntervalo = args[-1];
            System.out.println("Indice Fora do Intervalo: " + indiceForaIntervalo);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ex: " + ex);
        }
        
        try{
            System.out.printf("%d", "5");
        }catch(IllegalFormatConversionException ex){
            System.out.println("ex: " + ex);
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor inteiro (int): ");
        try{
            int entradaInt = scan.nextInt();
            System.out.println("entradaInt = " + entradaInt);
        }catch (InputMismatchException ex){
            System.out.println("ex: " + ex);
        }
        
        
                      
        List<Integer> lista = new ArrayList<>();
        Integer[] valores = {0, 1, 2, 3, 4, 5, 6, 7};
        lista.addAll(Arrays.asList(valores));
        try{
            System.out.println(lista.get(8));
        }catch (IndexOutOfBoundsException ex){
            System.out.println("ex: " + ex);
        }
        
        try{
            System.out.println(valores[8]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ex: " + ex);
        }
    }
}
