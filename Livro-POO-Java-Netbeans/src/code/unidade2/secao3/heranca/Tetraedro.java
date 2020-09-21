package code.unidade2.secao3.heranca;

/**
 * @author Jesimar S. Arantes
 */
public class Tetraedro extends Geom3D {

    private final double lado;
    
    public Tetraedro(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        super.area = Math.sqrt(3) * this.lado * this.lado;
        return super.area;
    }
    
    @Override
    public double calcVolume() {
        super.volume = (Math.sqrt(2) * this.lado * this.lado * this.lado)/12.0;
        return super.volume;
    }

    @Override
    public String toString() {
        return String.format("Tetraedro: {\n    area: %.2f\n    volume: %.2f\n}", 
                this.calcArea(), this.calcVolume());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tetraedro){
            Tetraedro tetra = (Tetraedro)obj;
            return this.lado == tetra.lado;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Tetraedro tetraedro1 = new Tetraedro(1);
        Tetraedro tetraedro2 = new Tetraedro(1);
        System.out.println(tetraedro1);
        System.out.println(tetraedro2);
        if (tetraedro1.equals(tetraedro2)){
            System.out.println("Figuras Geométricas Iguais");
        }else{
            System.out.println("Figuras Geométricas Diferentes");
        }
    }
}
