package code.unidade2.secao1.ex3;

/**
 * @author Jesimar S. Arantes
 * Código 2.3
 */
public class Triangulo{

    double ladoA;
    double ladoB;
    double ladoC;
    
    public Triangulo(double lado) {
        this.ladoA = lado;
        this.ladoB = lado;
        this.ladoC = lado;
    }
    
    public Triangulo(double a, double b, double c) {
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }
    
    @Override
    public String toString() {
        return String.format("Triangulo: {\n    a: %.2f\n    b: %.2f\n    c: %.2f\n}", 
                this.ladoA, this.ladoB, this.ladoC);
    }
    
    public static void main(String[] args) {
        Triangulo trianIsosceles = new Triangulo(5);
        Triangulo trianEscaleno = new Triangulo(3, 25, 26);
        System.out.println(trianIsosceles);
        System.out.println(trianEscaleno);
    }
}
