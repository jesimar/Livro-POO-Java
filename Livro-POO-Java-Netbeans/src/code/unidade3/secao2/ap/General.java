package code.unidade3.secao2.ap;

/**
 * @author Jesimar da Silva Arantes
 * Código Aula Prática
 */
public class General implements Hierarquia {
    
    private TipoDeArma tipoDeArma;

    public General(TipoDeArma arma) {
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
        return 1;
    }
}
