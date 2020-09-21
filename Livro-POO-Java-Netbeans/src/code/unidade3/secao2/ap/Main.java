package code.unidade3.secao2.ap;

import static code.unidade3.secao2.ap.TipoDeArma.*;

/**
 * @author Jesimar da Silva Arantes
 * Código Aula Prática
 */
public class Main {
    
    public static void main(String[] args) {
        General genWashington = new General(ARTILHARIA);
        Capitao capAmerica = new Capitao(CAVALARIA);
        Soldado solRambo = new Soldado(INFANTARIA);
        
        boolean comp1 = genWashington.superiorA(capAmerica);
        boolean comp2 = capAmerica.inferiorA(solRambo);
        boolean comp3 = genWashington.equivalenteA(solRambo);
        
        System.out.println("O General Washington é superior " +
                "ao Capitão América? " + comp1);
        System.out.println("O Capitão América é inferior " +
                "ao Soldado Rambo? " + comp2);
        System.out.println("O General Washington é equivalente " +
                "ao Soldado Rambo? " + comp3);
        
        //https://pt.wikipedia.org/wiki/Hierarquia_militar_do_Brasil
    }
}
