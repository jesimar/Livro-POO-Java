package code.unidade3.secao2.ap;

/**
 *
 * @author jesimar
 */
public interface Hierarquia {

    public boolean superiorA(Hierarquia obj);
    
    public boolean inferiorA(Hierarquia obj);
    
    public boolean equivalenteA(Hierarquia obj);
    
    public int ordemHierarquica();
}
