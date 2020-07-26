package code.unidade3.secao1.ex3;

/**
 *
 * @author Jesimar S. Arantes
 */
public abstract class Geom2D {
    protected double perimetro;
    protected double area;
    public abstract double calcPerimetro();
    public abstract double calcArea();
    public double getPerimetro() {
        return perimetro;
    }
    public double getArea() {
        return area;
    }
}
