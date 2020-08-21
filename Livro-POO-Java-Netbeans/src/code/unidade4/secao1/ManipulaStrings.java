package code.unidade4.secao1;

/**
 *
 * @author jesimar
 */
public class ManipulaStrings {
    
    public static void main(String[] args) {
        String str1 = new String("Orientação a objetos");
        String str2 = "Orientação a objetos";
        
        StringBuilder str3 = new StringBuilder("Orientação a objetos");
//        StringBuilder str4 = "Orientação a objetos";//não é aceito
        
        StringBuffer str5 = new StringBuffer("Orientação a objetos");
//        StringBuffer str6 = "Orientação a objetos";//não é aceito
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
//        System.out.println("str4: " + str4);
        System.out.println("str5: " + str5);
        
        
        ManipulaStrings manipulaStrings = new ManipulaStrings();
        manipulaStrings.sequenciaDeCaracteres();
        manipulaStrings.metodosStrings();
        manipulaStrings.concatenaString();
        manipulaStrings.superConcatenacaoStrings();
        manipulaStrings.comparacaoStrings();
    }
    
    public void sequenciaDeCaracteres(){
        char seqChar[] = {'l', 'i', 'v', 'r', 'o'};
        System.out.println(seqChar);
        for (char elemento : seqChar) {
            System.out.print(elemento);
        }
        System.out.println();
    }
    
    public void metodosStrings(){
        String nomeLivro = "Linguagem Orientada a Objetos";
        System.out.println(nomeLivro.toUpperCase());
        System.out.println(nomeLivro.toLowerCase());
        System.out.println(nomeLivro.replace("Linguagem", "Ling."));
        System.out.println(nomeLivro.length());
        System.out.println(nomeLivro.endsWith("Objetos"));
        System.out.println(nomeLivro.startsWith("Ling"));
        System.out.println(nomeLivro.contains("Orient"));
        String sp[] = nomeLivro.split(" ");
        for (String elem : sp) {
            System.out.println("elem: " + elem);
        }
        
        StringBuffer sBuffer = new StringBuffer("Jesimar");
        System.out.println("reverse: " + sBuffer);
        sBuffer = sBuffer.reverse();
        System.out.println("reverse: " + sBuffer);
        
//        StringBuilder sBuilder = "bla";// = new StringBuilder();
        
    }
    
    public void concatenaString() {
        String livro = "Linguagem";
        System.out.println(livro);
        livro = livro.concat(" Orientada");
        System.out.println(livro);
        livro += " a Objetos";
        System.out.println(livro);
    }
    
    public void superConcatenacaoStrings() {
        String superString = "";
        for (int i = 0; i < 100000; i++) {
            superString += ".";
        }
        System.out.println(superString);
    }

    public void comparacaoStrings() {
        String s1 = "ola";
        String s2 = new String("ola");
        String s3 = s1;
        String s4 = new String("ola");
        System.out.printf("s2: %b\n", s1==s2);
        System.out.printf("s3: %b\n", s1==s3);
        System.out.printf("s3: %b\n", s2==s3);
        System.out.printf("s4: %b\n", s2==s4);
    }
}
