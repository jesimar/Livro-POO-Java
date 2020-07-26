package code.unidade3.secao1.ap;

/**
 *
 * @author jesimar
 */
public class NaoTemRaizesReaisRuntimeException extends RuntimeException{
    public NaoTemRaizesReaisRuntimeException(String message) {
        super(message);
    }
    public NaoTemRaizesReaisRuntimeException(Throwable cause) {
        super(cause);
    }
    public NaoTemRaizesReaisRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }    
}
