package code.unidade4.secao2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author Jesimar da Silva Arantes
 * Código 4.7
 */
public class ManipulaArquivosTexto {

    public static void main(String[] args) {
        ManipulaArquivosTexto texto = new ManipulaArquivosTexto();
        texto.leitura1();
        //texto.leitura2();
    }

    public void leitura1() {
        try {
            File arquivo = new File("dados/poema.txt");
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.printf("%s%n", linha);
            }
        } catch (FileNotFoundException ex) {
            System.out.printf("Erro abertura do arquivo: %s.%n", ex.getMessage());
        }
    }

    public void leitura2() {
        try {
            FileReader arquivo = new FileReader("dados/poema.txt");
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();
            while (linha != null) {
                System.out.printf("%s%n", linha);
                linha = leitor.readLine();
            }
            arquivo.close();
        } catch (FileNotFoundException ex) {
            System.out.printf("Erro na abertura do arquivo: %s.%n", ex.getMessage());
            System.exit(0);
        } catch (IOException ex) {
            System.out.printf("Erro na leitura do arquivo: %s.%n", ex.getMessage());
        }
    }

}
