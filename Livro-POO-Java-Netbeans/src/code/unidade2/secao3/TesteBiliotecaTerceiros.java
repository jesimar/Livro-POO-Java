package code.unidade2.secao3;

import org.apache.commons.math3.primes.Primes;

/**
 * @author Jesimar da Silva Arantes
 * Código 2.9
 */
public class TesteBiliotecaTerceiros {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            if (Primes.isPrime(i)){
                System.out.println("num_primo = " + i);
            }
        }
    }
}
