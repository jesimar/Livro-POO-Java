package code.unidade2.secao2.ap;

/**
 * @author Jesimar S. Arantes
 * Código: AP
 */
public class AulaPratica {
    public static void main(String[] args) {
        AulaPratica ap = new AulaPratica();
        int s = 100;
        System.out.println("Somatorio: " + ap.somatorioFor(s));
        System.out.println("Somatorio: " + ap.somatorioWhile(s));
        System.out.println("Somatorio: " + ap.somatorioDoWhile(s));
    }
    
    public long somatorioFor(int n){
        long soma = 0;
        for (int i = 0; i <= n; i++){
            soma += i;
        }
        return soma;
    }
    
    public long somatorioWhile(int n){
        long soma = 0;
        int i = 0;
        while (i <= n){
            soma += i;
            i++;
        }
        return soma;
    }
    
    public long somatorioDoWhile(int n){
        long soma = 0;
        int i = 0;
        do {
            soma += i;
            i++;
        } while (i <= n);
        return soma;
    }
}