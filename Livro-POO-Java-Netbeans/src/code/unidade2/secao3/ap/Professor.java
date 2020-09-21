package code.unidade2.secao3.ap;

/**
 * @author Jesimar da Silva Arantes
 * Código: Aula Prática
 */
public class Professor extends Pessoa {
    
    private String universidade;
    private String departamento;
    private int numeroDaSala;
    private final String cpf;
    
    public Professor(String nome, String dataNascimento, char sexo, 
            String cidadeNatal, String cidadeReside, 
            String cpf, String universidade, String departamento, int numeroDaSala) {
        super(nome, dataNascimento, sexo, cidadeNatal, cidadeReside);
        this.cpf = cpf;
        this.universidade = universidade;
        this.departamento = departamento;
        this.numeroDaSala = numeroDaSala;
    }

    public String getCpf() {
        return cpf;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + super.nome + ", cidadeReside=" + super.cidadeReside + 
                ", sexo=" + super.sexo + ", dataNascimento=" + super.dataNascimento + 
                ", cidadeNatal=" + super.cidadeNatal + ", universidade=" + this.universidade + 
                ", departamento=" + this.departamento + ", numeroDaSala=" + this.numeroDaSala + 
                ", cpf=" + this.cpf + '}';
    }
    
}
