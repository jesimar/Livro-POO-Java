package code.unidade2.secao3.heranca;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Retangulo extends Geom2D {

    private final double base;
    private final double altura;
    
    public Retangulo(double lado) {
        this.base = lado;
        this.altura = lado;
    }
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcPerimetro() {
        super.perimetro = 2 * this.base + 2 * this.altura;
        return super.perimetro;
    }

    @Override
    public double calcArea() {
        super.area = this.base * this.altura;
        return super.area;
    }

    @Override
    public String toString() {
        return String.format("Retangulo: {\n    perimetro: %.2f\n    area: %.2f\n}", 
                this.calcPerimetro(), this.calcArea());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Retangulo){
            Retangulo rect = (Retangulo)obj;
            return (this.base == rect.base) && (this.altura == rect.altura);
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Retangulo rect1 = new Retangulo(4, 25);
        Retangulo rect2 = new Retangulo(4, 26);
        System.out.println(rect1); // invoca método toString
        System.out.println(rect2); // invoca método toString
        if (rect1.equals(rect2)){  // invoca método equals
            System.out.println("Figuras Geométricas Iguais");
        }else{
            System.out.println("Figuras Geométricas Diferentes");
        }
    }
}
