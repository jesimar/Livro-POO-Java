package code.unidade3.secao1.ex1;

import java.util.Locale;

/**
 * @author Jesimar da Silva Arantes
 * Síntese de formatadores de impressão
 */
public class FormatadoresImpressao {
    public static void main(String[] args) { 
        boolean valorBoolean = false;
        
        byte valorByte = 123;
        short valorShort = 12312;
        int valorInt = 127;
        long valorLong = 13214123412l;
        
        float valorFloat   = 3.141592f;
        double valorDouble = 3.141592;
        
        char valorChar = 'c';
        String valorString = "string";
        
        System.out.printf("Inteiro byte: %d%n", valorByte);
        System.out.printf("Inteiro short: %d%n", valorShort);
        System.out.printf("Inteiro int: %d%n", valorInt);
        System.out.printf("Inteiro long: %d%n", valorLong);
        
        System.out.printf("Inteiro Octal: %o%n", valorInt);
        System.out.printf("Inteiro Hexadecimal: %x%n", valorInt);
        System.out.printf("Inteiro Hexadecimal: %X%n", valorInt);
        
        System.out.printf("Real float: %f%n", valorFloat);
        System.out.printf("Real double: %f%n", valorDouble);
        System.out.printf("Real double: %e%n", valorDouble);
        System.out.printf("Real double: %E%n", valorDouble);
        System.out.printf("Real double: %g%n", valorDouble);
        
        System.out.printf(Locale.ENGLISH, "Real double: %g%n", valorDouble);
        
        
        System.out.printf("Lógico boolean (minúsculo): %b%n", valorBoolean);
        System.out.printf("Lógico boolean (maiúsculo): %B%n", valorBoolean); 
        
        System.out.printf("Caractere char: %c%n", valorChar);
        System.out.printf("Caractere char: %C%n", valorChar);
        
        System.out.printf("String: %s%n", valorString);
        System.out.printf("String: %S%n", valorString);
        
        System.out.printf("Símbolo Porcentagem: %% %n");
        System.out.printf("%d%% %n", 68); 
        
        System.out.printf("L1%nL2 %n"); 
    }
}
