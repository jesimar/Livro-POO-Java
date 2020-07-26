package code.unidade3.secao2.ex2;

/**
 *
 * @author jesimar
 */
public class Livro implements Comparable<Livro>{
    
    public String nome;
    public double custo;

    public Livro(String nome, double custo) {
        this.nome = nome;
        this.custo = custo;
    }

    @Override
    public int compareTo(Livro livro) {//vantagem de usar template não precisa fazer casting.
        if (Math.abs(custo - livro.custo) < 0.001){
            return 0;
        }else if (custo > livro.custo){
            return 1;
        }else{
            return -1;
        }
        //Linha especifica para comparção de double
//        return Double.compare(custo, o.custo);
//        return Integer.compare(custo, o.custo);
    }
    
//    @Override
//    public int compareTo(Livro o) {//vantagem de usar template não precisa fazer casting.
//        if (nome.length() == o.nome.length()){
//            return 0;
//        }else if (nome.length() > o.nome.length()){
//            return 1;
//        }else{
//            return -1;
//        }
//    }
    
    //citar que o método compareTo é muito utilizado para fazer ordenação.   
}
