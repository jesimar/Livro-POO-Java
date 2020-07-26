package code.unidade2.secao3.ap;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João da Silva", "01-02-2000", 'm',
                "Rio de Janeiro - RJ", "São Paulo - SP", 105134, 
                "Universidade do Brasil", "Ciência da Computação");
        Aluno aluno2 = new Aluno("Ana Souza", "31-12-2001", 'f', 
                "Belo Horizonte - MG", "São Paulo - SP", 105138, 
                "Universidade do Brasil", "Ciência da Computação");
        Professor professor1 = new Professor("Marcos Pereira", "10-06-1980", 'm', 
                "Goiania - GO", "São Paulo - SP", "123.456.789-01", 
                "Universidade do Brasil", "Departamento de Ciência da Computação", 5);
        Professor professor2 = new Professor("Maria Fernandes", "15-08-1985", 'f', 
                "Porto Alegre - RG", "São Paulo - SP", "456.789.012-34", 
                "Universidade do Brasil", "Departamento de Ciência da Computação", 8);
        System.out.println("Aluno1: " + aluno1);
        System.out.println("Aluno2: " + aluno2);
        System.out.println("Professor1: " + professor1);
        System.out.println("Professor2: " + professor2);
    }
}
