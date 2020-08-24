package code.unidade4.secao2.ap;

/**
 *
 * @author jesimar
 */
public class Filme {
    
    private int codigo;
    private String nome;
    private int ano;
    private String diretor;
    private String classificacao;
    private String pais;

    public Filme(int codigo, String nome, int ano, String diretor, 
            String classificacao, String pais) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
        this.classificacao = classificacao;
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }    
    
}
