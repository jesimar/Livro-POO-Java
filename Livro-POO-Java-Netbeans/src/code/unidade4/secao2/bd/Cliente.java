package code.unidade4.secao2.bd;

/**
 *
 * @author jesimar
 */
public class Cliente {
    
    private int codigo;
    private String nome;
    private int idade;
    private String profissao;
    private String cidade;
    private String estado;

    public Cliente(int codigo, String nome, int idade, String profissao, 
            String cidade, String estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.cidade = cidade;
        this.estado = estado;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }    
    
}
