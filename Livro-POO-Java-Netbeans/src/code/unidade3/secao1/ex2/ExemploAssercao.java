package code.unidade3.secao1.ex2;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.8
 */
public class ExemploAssercao {
    public static void main(String[] args) {  
        //faça testes com as idades 20, 12, -1, 84, -20
        int idade = 20;
        assert (idade >= 0) : "Aviso: não existe idade negativa";
        System.out.printf("Idade: %d%n", idade);
    }
}
