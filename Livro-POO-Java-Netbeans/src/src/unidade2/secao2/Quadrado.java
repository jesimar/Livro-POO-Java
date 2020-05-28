package src.unidade2.secao2;

/**
 *
 * @author Jesimar S. Arantes
 */

public class Quadrado extends Geom2D{

    double lado;
    
    public Quadrado(int lado) {
        this.lado = lado;
    }
    
    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcPerimetro() {
        return 4 * this.lado;
    }

    @Override
    double calcArea() {
        return this.lado *this.lado;
    }

    @Override
    public String toString() {
        return String.format("Quadrado: {\n    perimetro: %.2f\n    area: %.2f\n}", 
                this.calcPerimetro(), this.calcArea());
    }   
}
