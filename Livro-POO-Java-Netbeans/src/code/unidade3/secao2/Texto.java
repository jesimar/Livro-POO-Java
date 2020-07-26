package code.unidade3.secao2;

/**
 *
 * @author jesimar
 */
public class Texto implements Comparavel {
    
    private final String frase;

    public Texto(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean maiorQue(Comparavel obj) {
        if (frase.length() > ((Texto)obj).frase.length()){
            return true;
        }
        return false;
    }

    @Override
    public boolean menorQue(Comparavel obj) {
        if (frase.length() < ((Texto)obj).frase.length()){
            return true;
        }
        return false;
    }

    @Override
    public boolean igualA(Comparavel obj) {
        if (frase.length() == ((Texto)obj).frase.length()){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Texto estrofe1 = new Texto("minha terra tem palmeiras");
        Texto estrofe2 = new Texto("onde canta o sabiá");
        Texto estrofe3 = new Texto("as aves, que aqui gorjeiam");
        boolean isIqual = estrofe1.igualA(estrofe2);
        boolean isMaior = estrofe1.maiorQue(estrofe2);
        boolean isMenor = estrofe1.menorQue(estrofe2);
        System.out.println("igual " + isIqual);
        System.out.println("maior " + isMaior);
        System.out.println("menor " + isMenor);
        isIqual = estrofe1.igualA(estrofe3);
        isMaior = estrofe1.maiorQue(estrofe3);
        isMenor = estrofe1.menorQue(estrofe3);
        System.out.println("igual " + isIqual);
        System.out.println("maior " + isMaior);
        System.out.println("menor " + isMenor);
        
        //Linha mostrando exemplo de polimorfismo
        //Comparavel compText = new Texto("aqui temos um exemplo de polimorfismo");
    }
}
