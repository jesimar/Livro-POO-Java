package code.unidade3.secao2.ex1;

import java.io.IOException;
import java.sql.SQLException;

/**
 * A presente classe tem por objetivo mostrar como criar a documentação de uma classe.
 * @author Jesimar S. Arantes
 * @version 1.0
 * @since 1.0
 */
public class ExemploGerarJavadoc {

    /**
     * Esta é a função principal da classe, ou seja, é o ponto de entrada da aplicação.
     * @param args descrição do que pode ser recebido via linha de comando.
     */
    public static void main(String[] args) {
        
    }
    
    /**
     * Descrição da constante matemática PI.
     */
    public static final double PI = 3.141592;
    
    /**
     * Descrição da constante de Euler (E).
     */
    public static final double E = 2.718281;

    /**
     * Este é um exemplo de construtor da classe.
     */
    public ExemploGerarJavadoc() {
//        exemploMetodoLancaMultiExcecoes();

    }
    
    /**
     * Este é um exemplo de método sem parâmetros e sem retorno.
     */
    public void exemploMetodo(){
        
    }
    
    /**
     * Este é um exemplo de método com parâmetros e sem retorno.
     * @param valor1 colocar a descrição do parâmetro valor1.
     * @param valor2 colocar a descrição do parâmetro valor2.
     * @param valor3 colocar a descrição do parâmetro valor3. 
     * @see 
     */
    public void exemploMetodoComParametros(char valor1, int valor2, float valor3){
        
    }
    
    /**
     * Este é um exemplo de método com um parâmetro e com retorno.
     * @param valor colocar a descrição do parâmetro valor.
     * @return colocar a descrição do valor que é retornado.
     */
    public String exemploMetodoComRetorno(char valor){
        return "exemplo retorno";
    }
    
    /**
     * Este é um exemplo de método sem parâmetros, sem retorno e que lança uma exceção.
     * @throws java.lang.Exception
     */
    public void exemploMetodoLancaExcecao() throws Exception{
        throw new Exception();
    }
    
    /**
     * Este é um exemplo de método sem parâmetros, sem retorno e que lança várias exceções.
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     * @see code.unidade3.secao2.ex1.ExemploGerarJavadoc
     */
    public void exemploMetodoLancaMultiExcecoes() throws SQLException, IOException{
        if (5 < 3){
            throw new SQLException();
        }else{
            throw new IOException();
        }
    }
    
    /**
     * Este é um exemplo de método que foi depreciado com o tempo, assim deve-se 
     * evitar utilizar tais métodos. 
     * @version 1.0
     * @since 1.0
     * @see java.lang.System
     * @deprecated desde a versão 1.0
     */
    public void exemploMethodoDepreciado(){
        
    }
    
    /**
     * Colocar a descrição do método aqui. 
     * Este é um exemplo de método com dois parâmetros, 
     * com retorno e que pode lançar exceções.
     * @param arg1 colocar a descrição do parâmetro arg1. 
     * @param arg2 colocar a descrição do parâmetro arg2. 
     * @return colocar a descrição do valor que é retornado.
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     * @see java.lang.System
     * @see #exemploMetodoLancaMultiExcecoes
     * @since 1.0
     * @version 1.0
     * @author Jesimar da Silva Arantes
     */
    public double exemploMetodoCompleto(int arg1, float arg2) 
            throws SQLException, IOException{
        if (arg1 < 0){
            throw new SQLException();
        }else if (arg2 < 0){
            throw new IOException();
        }
        return 0.0;
    }
    
}
