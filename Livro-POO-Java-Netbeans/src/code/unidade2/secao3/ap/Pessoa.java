package code.unidade2.secao3.ap;

public class Pessoa {
    
    protected String nome;
    protected String cidadeReside;
    protected final char sexo;
    protected final String dataNascimento;
    protected final String cidadeNatal;
    
    public Pessoa(String nome, String dataNascimento, char sexo, 
            String cidadeNatal, String cidadeReside) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cidadeNatal = cidadeNatal;
        this.cidadeReside = cidadeReside;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public String getCidadeReside() {
        return cidadeReside;
    }

    public void setCidadeReside(String cidadeReside) {
        this.cidadeReside = cidadeReside;
    }    

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cidadeReside=" + cidadeReside + 
                ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + 
                ", cidadeNatal=" + cidadeNatal + '}';
    }
}
