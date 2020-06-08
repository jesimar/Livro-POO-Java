package outros;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Triangulo extends Geom2D{

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
    
    static double calcArea(double base, double altura){
        return base * altura / 2;
    }
    
    static double calcArea(double a, double b, double c){
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
