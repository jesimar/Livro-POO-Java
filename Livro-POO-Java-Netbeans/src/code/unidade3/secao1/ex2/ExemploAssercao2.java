package code.unidade3.secao1.ex2;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.9
 */
public class ExemploAssercao2 {
   
    public static void main(String[] args) {        
        ExemploAssercao2 ex = new ExemploAssercao2();
        System.out.printf("Valor de IMC = %f", ex.calcularIMC(-60, 1.68f));
    }
    
    public float calcularIMC(float massa, float altura){
        assert (massa > 0) : "Aviso: não existe massa negativa";
        assert (altura > 0) : "Aviso: não existe altura negativa";
        assert (massa != 0) : "Aviso: não existe pessoa com massa igual a 0";
        assert (altura != 0) : "Aviso: não existe pessoa com altura igual a 0";
        return massa/(altura*altura);
    }
}
