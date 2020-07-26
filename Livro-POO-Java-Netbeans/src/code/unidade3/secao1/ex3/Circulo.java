package code.unidade3.secao1.ex3;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Circulo extends Geom2D {

    private final double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcPerimetro() {
        super.perimetro = 2 * Math.PI * this.raio;
        return super.perimetro;
    }

    @Override
    public double calcArea() {
        super.area = Math.PI * this.raio * this.raio;
        return super.area;
    }

    @Override
    public String toString() {
        return String.format("Circulo: {\n    perimetro: %.2f\n    area: %.2f\n}", 
                this.calcPerimetro(), this.calcArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circulo){
            Circulo circ = (Circulo)obj;
            return this.raio == circ.raio;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(3);
        System.out.println(circulo1);
        System.out.println(circulo2);
        if (circulo1.equals(circulo2)){
            System.out.println("Figuras Geométricas Iguais");
        }else{
            System.out.println("Figuras Geométricas Diferentes");
        }
    }
}
