package code.unidade3.secao1.ex2;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.7
 */
public class ValorNegativoException extends RuntimeException {

    public ValorNegativoException() {
    }
    
    public ValorNegativoException(String message) {
        super(message);
    }
    
    public ValorNegativoException(String msg, Throwable cause){
        super(msg, cause);
    }
}
