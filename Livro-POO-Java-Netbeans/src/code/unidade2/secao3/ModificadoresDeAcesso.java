package code.unidade2.secao3;

/**
 *
 * @author Jesimar da Silva Arantes
 */
public class ModificadoresDeAcesso {
    
    private int atrPrivado = 10;
    int atrPadrao = 20;
    protected int atrProtegido = 30;
    public int atrPublico = 40;

    private ModificadoresDeAcesso() {
        System.out.println("construtor privado");
    }
    
//    ModificadoresDeAcesso() {
//        System.out.println("construtor padrão");
//    }
//    
//    protected ModificadoresDeAcesso() {
//        System.out.println("construtor protegido");
//    }
//    
//    public ModificadoresDeAcesso() {
//        System.out.println("construtor publico");
//    }

    private void metodoPrivado(){
        System.out.println("metodo privado");
    }
    
    void metodoPadrão(){
        System.out.println("metodo padrão");
    }
    
    protected void metodoProtegido(){
        System.out.println("metodo protegido");
    }
    
    public void metodoPublico(){
        System.out.println("metodo publico");
    }
    
    private class classePrivada{
        public classePrivada() {
            System.out.println("classe privada");
        }
        
    }
    
    class classePadrao{
        public classePadrao() {
            System.out.println("classe padrão");
        }
    }
    
    protected class classeProtegida{
        public classeProtegida() {
            System.out.println("classe protegida");
        }
    }
    
    public class classePublica{
        public classePublica() {
            System.out.println("classe publica");
        }
    }
}

