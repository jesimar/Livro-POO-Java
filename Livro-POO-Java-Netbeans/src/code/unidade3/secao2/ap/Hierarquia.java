package code.unidade3.secao2.ap;

/**
 * @author Jesimar da Silva Arantes
 * Código Aula Prática
 */
public interface Hierarquia {

    public boolean superiorA(Hierarquia obj);
    
    public boolean inferiorA(Hierarquia obj);
    
    public boolean equivalenteA(Hierarquia obj);
    
    public int ordemHierarquica();
}
