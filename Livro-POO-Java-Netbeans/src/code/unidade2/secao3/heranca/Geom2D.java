package code.unidade2.secao3.heranca;

/**
 * @author Jesimar S. Arantes
 * Código 2.12
 */
public class Geom2D { //herda implicitamente a classe Object
    protected double perimetro;
    protected double area;
    public double calcPerimetro(){
        return 0; // retorna 0, pois não há definição para um objeto 2D abstrato
    }
    public double calcArea(){
        return 0; // retorna 0, pois não há definição para um objeto 2D abstrato
    }
    public double getPerimetro() {
        return perimetro;
    }
    public double getArea() {
        return area;
    }
}
