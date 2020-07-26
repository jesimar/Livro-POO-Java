package code.unidade3.secao2;

/**
 *
 * @author jesimar
 * @param <T>
 */
public interface ComparavelGenerics<T extends Object>{

    public boolean maiorQue(T obj);
    
    public boolean menorQue(T obj);
    
    public boolean igualA(T obj);
}
