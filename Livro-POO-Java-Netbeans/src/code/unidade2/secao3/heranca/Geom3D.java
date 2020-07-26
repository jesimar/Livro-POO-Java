package code.unidade2.secao3.heranca;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Geom3D { //herda implicitamente a classe Object
    protected double area;
    protected double volume;
    public double calcArea(){
        return 0; // retorna 0, pois não há definição para um objeto 3D abstrato
    }
    public double calcVolume(){
        return 0; // retorna 0, pois não há definição para um objeto 3D abstrato
    }
    public double getArea() {
        return area;
    }
    public double getVolume() {
        return volume;
    }
}
