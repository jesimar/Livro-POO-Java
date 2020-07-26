package code.unidade2.secao1.ex5;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Triangulo extends Geom2D {

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
    double calcPerimetro() {
        super.perimetro = this.ladoA + this.ladoB + this.ladoC;
        return super.perimetro;
    }

    @Override
    double calcArea() {//area calculada com a formula de Herão.
        double p = calcPerimetro()/2;//semiperímetro
        super.area = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
        return area;
    }

    @Override
    public String toString() {
        return String.format("Triangulo: {\n    perimetro: %.2f\n    area: %.2f\n}", 
                this.calcPerimetro(), this.calcArea());
    }
    
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 25, 26);
        System.out.println("Perimetro: " + triangulo.calcPerimetro());
    }
}
