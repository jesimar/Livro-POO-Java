package code.outros;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Quadrado1 extends Regular2D {
    
    public Quadrado1(double lado) {
        super.lado = lado;
        super.angulo = 90;
    }

    @Override
    public double calcPerimetro() {
        super.perimetro = 4 * this.lado;
        return super.perimetro;
    }

    @Override
    public double calcArea() {
        super.area = this.lado * this.lado;
        return area;
    }

    @Override
    public String toString() {
        return String.format("Quadrado: {\n    perimetro: %.2f\n    area: %.2f\n}", 
                this.calcPerimetro(), this.calcArea());
    }
    
    public static void main(String[] args) {
        Quadrado1 quadrado = new Quadrado1(2);
        System.out.println(quadrado);
    }
}
