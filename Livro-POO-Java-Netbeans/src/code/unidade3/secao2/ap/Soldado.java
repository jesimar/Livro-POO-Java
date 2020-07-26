package code.unidade3.secao2.ap;

/**
 *
 * @author jesimar
 */
public class Soldado implements Hierarquia {
    
    private TipoDeArma tipoDeArma;

    public Soldado(TipoDeArma arma) {
        this.tipoDeArma = arma;
    }

    @Override
    public boolean superiorA(Hierarquia obj) {
        return this.ordemHierarquica() < obj.ordemHierarquica();
    }

    @Override
    public boolean inferiorA(Hierarquia obj) {
        return this.ordemHierarquica() > obj.ordemHierarquica();
    }

    @Override
    public boolean equivalenteA(Hierarquia obj) {
        return this.ordemHierarquica() == obj.ordemHierarquica();
    }

    @Override
    public int ordemHierarquica() {
        return 14;
    }
}
