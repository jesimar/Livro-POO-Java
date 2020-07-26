package code.unidade2.secao3.heranca;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Triangulo extends Geom2D {

    private final double ladoA;
    private final double ladoB;
    private final double ladoC;
    
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
    public double calcPerimetro() {
        super.perimetro = this.ladoA + this.ladoB + this.ladoC;
        return super.perimetro;
    }

    @Override
    public double calcArea() {//area calculada com a formula de Herão.
        double p = calcPerimetro()/2;//semiperímetro
        super.area = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
        return super.area;
    }

    @Override
    public String toString() {
        return String.format("Triangulo: {\n    perimetro: %.2f\n    area: %.2f\n}", 
                this.calcPerimetro(), this.calcArea());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangulo){
            Triangulo trian = (Triangulo)obj;
            return (this.ladoA == trian.ladoA) && (this.ladoB == trian.ladoB) && (this.ladoC == trian.ladoC);
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3, 25, 26);
        Triangulo triangulo2 = new Triangulo(3, 25, 26);
        System.out.println(triangulo1);
        System.out.println(triangulo2);
        if (triangulo1.equals(triangulo2)){
            System.out.println("Figuras Geométricas Iguais");
        }else{
            System.out.println("Figuras Geométricas Diferentes");
        }
    }
}
