package code.unidade3.secao1.ap;

/**
 * @author Jesimar da Silva Arantes
 * Código: Aula Prática
 */
public class NaoTemRaizesReaisException extends Exception{
    public NaoTemRaizesReaisException(String message) {
        super(message);
    }
    public NaoTemRaizesReaisException(Throwable cause) {
        super(cause);
    }
    public NaoTemRaizesReaisException(String message, Throwable cause) {
        super(message, cause);
    }    
}
