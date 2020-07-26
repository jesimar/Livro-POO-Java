package code.unidade2.secao3.ap;

public class Aluno extends Pessoa {

    private final int numeroMatricula;
    private String universidade;
    private String curso;

    public Aluno(String nome, String dataNascimento, char sexo, 
            String cidadeNatal, String cidadeReside, 
            int numeroMatricula, String universidade, String curso) {
        super(nome, dataNascimento, sexo, cidadeNatal, cidadeReside);
        this.numeroMatricula = numeroMatricula;
        this.universidade = universidade;
        this.curso = curso;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    
    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + super.nome + ", cidadeReside=" + super.cidadeReside + 
                ", sexo=" + super.sexo + ", dataNascimento=" + super.dataNascimento + 
                ", cidadeNatal=" + super.cidadeNatal + ", numeroMatricula=" + this.numeroMatricula + 
                ", universidade=" + this.universidade + ", curso=" + this.curso + '}';
    }

}
