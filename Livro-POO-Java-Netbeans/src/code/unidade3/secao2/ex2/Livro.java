package code.unidade3.secao2.ex2;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.19
 */
public class Livro implements Comparable<Livro>{
    
    public String nome;
    public double custo;

    public Livro(String nome, double custo) {
        this.nome = nome;
        this.custo = custo;
    }

    @Override
    public int compareTo(Livro livro) {
        if (Math.abs(custo - livro.custo) < 0.001){
            return 0;
        }else if (custo > livro.custo){
            return 1;
        }else{
            return -1;
        }
    } 
}
