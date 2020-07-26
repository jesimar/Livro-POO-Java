package code.unidade3.secao2;

/**
 *
 * @author jesimar
 */
public class TextoGenerics implements ComparavelGenerics<TextoGenerics> {
    
    private final String frase;

    public TextoGenerics(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean maiorQue(TextoGenerics obj) {
        if (frase.length() > obj.frase.length()){
            return true;
        }
        return false;
    }

    @Override
    public boolean menorQue(TextoGenerics obj) {
        if (frase.length() < obj.frase.length()){
            return true;
        }
        return false;
    }

    @Override
    public boolean igualA(TextoGenerics obj) {
        if (frase.length() == obj.frase.length()){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        TextoGenerics estrofe1 = new TextoGenerics("minha terra tem palmeiras");
        TextoGenerics estrofe2 = new TextoGenerics("onde canta o sabiá");
        TextoGenerics estrofe3 = new TextoGenerics("as aves, que aqui gorjeiam");
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
        //ComparavelGenerics compText = new TextoGenerics("aqui temos um exemplo de polimorfismo");
    }
}
