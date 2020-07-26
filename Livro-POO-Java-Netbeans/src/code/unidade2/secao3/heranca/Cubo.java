package code.unidade2.secao3.heranca;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Cubo extends Geom3D {

    private final double lado;
    
    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        super.area = 6 * this.lado * this.lado;
        return super.area;
    }
    
    @Override
    public double calcVolume() {
        super.volume = this.lado * this.lado * this.lado;
        return super.volume;
    }

    @Override
    public String toString() {
        return String.format("Cubo: {\n    area: %.2f\n    volume: %.2f\n}", 
                this.calcArea(), this.calcVolume());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cubo){
            Cubo cubo = (Cubo)obj;
            return this.lado == cubo.lado;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(1);
        Cubo cubo2 = new Cubo(1);
        System.out.println(cubo1); // invoca método toString
        System.out.println(cubo2); // invoca método toString
        if (cubo1.equals(cubo2)){  // invoca método equals
            System.out.println("Figuras Geométricas Iguais");
        }else{
            System.out.println("Figuras Geométricas Diferentes");
        }
    }
}
