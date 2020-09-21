package code.unidade4.secao1.ap;

/**
 * @author Jesimar da Silva Arantes
 * Código Aula Prática
 */
public class AnaliseDeStrings {
    
    public static long concatenaStringPlus(int numConcatenacoes) {
        long tempoInicial = System.currentTimeMillis();
        String superString = "";
        for (int i = 0; i < numConcatenacoes; i++) {
            superString += ".";
        }
        long tempoFinal = System.currentTimeMillis();
        long tempo = tempoFinal - tempoInicial;
//        System.out.println(superString);
//        System.out.println("Tempo: " + tempo);
        return tempo;
    }        
    
    public static long concatenaStringConcat(int numConcatenacoes) {
        long tempoInicial = System.currentTimeMillis();
        String superString = "";
        for (int i = 0; i < numConcatenacoes; i++) {
            superString = superString.concat(".");
        }
        long tempoFinal = System.currentTimeMillis();
        long tempo = tempoFinal - tempoInicial;
//        System.out.println(superString);
//        System.out.println("Tempo: " + tempo);
        return tempo;
    }
    
    public static long concatenaStringBuilder(int numConcatenacoes) {
        long tempoInicial = System.currentTimeMillis();
        StringBuilder superString = new StringBuilder("");
        for (int i = 0; i < numConcatenacoes; i++) {
            superString.append(".");
        }
        long tempoFinal = System.currentTimeMillis();
        long tempo = tempoFinal - tempoInicial;
//        System.out.println(superString);
//        System.out.println("Tempo: " + tempo);
        return tempo;
    }
        
    public static long concatenaStringBuffer(int numConcatenacoes) {
        long tempoInicial = System.currentTimeMillis();
        StringBuffer superString = new StringBuffer("");
        for (int i = 0; i < numConcatenacoes; i++) {
            superString.append(".");
        }
        long tempoFinal = System.currentTimeMillis();
        long tempo = tempoFinal - tempoInicial;
//        System.out.println(superString);
//        System.out.println("Tempo: " + tempo);
        return tempo;
    }
    
    public static long[] executaTodasAsAnalisesStrings(){
        int numRepeticoes = 5;
        int numConcatenacoes = 100000;
//        long timeStringPlus[] = new long[numRepeticoes];
//        for (int i = 0; i < numRepeticoes; i++){
//            timeStringPlus[i] = AnaliseDeStrings.concatenaStringPlus(numIteracoes);
//        }
        long timeStringConcat[] = new long[numRepeticoes];
        for (int i = 0; i < numRepeticoes; i++){
            timeStringConcat[i] = AnaliseDeStrings.concatenaStringConcat(numConcatenacoes);
        }
        long timeStringBuilder[] = new long[numRepeticoes];
        for (int i = 0; i < numRepeticoes; i++){
            timeStringBuilder[i] = AnaliseDeStrings.concatenaStringBuilder(numConcatenacoes);
        }
        long timeStringBuffer[] = new long[numRepeticoes];
        for (int i = 0; i < numRepeticoes; i++){
            timeStringBuffer[i] = AnaliseDeStrings.concatenaStringBuffer(numConcatenacoes);
        }
        
        int numComp = 3;
        long media[] = new long[numComp];
        long soma[] = new long[numComp]; 
        for (int i = 0; i < numComp; i++){
            soma[i] = 0;
        }
        for (int i = 0; i < numRepeticoes; i++){
//            soma[0] += timeStringPlus[i];
            soma[0] += timeStringConcat[i];
            soma[1] += timeStringBuilder[i];
            soma[2] += timeStringBuffer[i];
        }
        for (int i = 0; i < numComp; i++){
            media[i] = soma[i]/numRepeticoes;
        }
        return media;
    }
}
