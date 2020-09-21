package code.unidade3.secao1.ap;

/**
 * @author Jesimar da Silva Arantes
 * Código: Aula Prática
 */
public class Equacao {
    
    public static double raizEq2GrauX1(double a, double b, double c) 
            throws NaoTemRaizesReaisException{
        double delta = b * b - 4 * a * c;
        if (delta < 0){
            throw new NaoTemRaizesReaisException("Sem raizes reais (delta negativo)");
        }
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        return x1;
    }
    
    public static double raizEq2GrauX2(double a, double b, double c) 
            throws NaoTemRaizesReaisException{
        double delta = b * b - 4 * a * c;
        if (delta < 0){
            throw new NaoTemRaizesReaisException("Sem raizes reais (delta negativo)");
        }
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return x2;
    }
    
    public static double raizEq2GrauX1_RT(double a, double b, double c)
            throws NaoTemRaizesReaisRuntimeException{
        double delta = b * b - 4 * a * c;
        if (delta < 0){
            throw new NaoTemRaizesReaisRuntimeException("Sem raizes reais (delta negativo)");
        }
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        return x1;
    }
    
    public static double raizEq2GrauX2_RT(double a, double b, double c) 
            throws NaoTemRaizesReaisRuntimeException{
        double delta = b * b - 4 * a * c;
        if (delta < 0){
            throw new NaoTemRaizesReaisRuntimeException("Sem raizes reais (delta negativo)");
        }
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return x2;
    }
    
}
