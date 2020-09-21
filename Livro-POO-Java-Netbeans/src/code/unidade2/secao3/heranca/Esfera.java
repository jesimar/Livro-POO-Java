package code.unidade2.secao3.heranca;

/**
 * @author Jesimar S. Arantes
 */
public class Esfera extends Geom3D {

    private final double raio;
    
    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        super.area = 4 * Math.PI * this.raio * this.raio;
        return super.area;
    }
    
    @Override
    public double calcVolume() {
        super.volume = (4.0/3.0) * Math.PI * this.raio * this.raio * this.raio;
        return super.volume;
    }

    @Override
    public String toString() {
        return String.format("Esfera: {\n    area: %.2f\n    volume: %.2f\n}", 
                this.calcArea(), this.calcVolume());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Esfera){
            Esfera esfera = (Esfera)obj;
            return this.raio == esfera.raio;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Esfera esfera1 = new Esfera(1);
        Esfera esfera2 = new Esfera(1);
        System.out.println(esfera1);
        System.out.println(esfera2);
        if (esfera1.equals(esfera2)){
            System.out.println("Figuras Geométricas Iguais");
        }else{
            System.out.println("Figuras Geométricas Diferentes");
        }
    }
}
