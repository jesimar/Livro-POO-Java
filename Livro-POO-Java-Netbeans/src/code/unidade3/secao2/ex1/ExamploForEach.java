package code.unidade3.secao2.ex1;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.13
 */
public class ExamploForEach {
    public static void main(String[] args) {
        System.out.println("Soma: " + soma1());
        System.out.println("Soma: " + soma2());
        
        forEachChar();
        forEachString();
    }
    
    public static int soma1(){
        int soma = 0;
        for (int i = 1; i < 6; i++){
            soma += i;
        }
        return soma;
    }
    
    public static int soma2(){
        int colecao[] = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int elem : colecao){
            soma += elem;
        }
        return soma;
    }
    
    public static void forEachChar(){
        String livro = "Linguagem Orientada a Objetos";
        for (char letra : livro.toCharArray()){
            System.out.println("character: " + letra);
        }
    }
    
    public static void forEachString(){
        String livro[] = {"Linguagem", "Orientada", "a", "Objetos"};
        for (String nome : livro){
            System.out.println("nome: " + nome);
        }
    }
}
