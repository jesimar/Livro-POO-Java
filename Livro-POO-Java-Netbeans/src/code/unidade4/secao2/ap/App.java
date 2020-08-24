package code.unidade4.secao2.ap;

import java.sql.Connection;

/**
 *
 * @author jesimar
 */
public class App {
    public static void main(String[] args) {
        ConexaoBD conBD = new ConexaoBD();
        Connection connection = conBD.getConexao();        
        Consultas consultas = new Consultas();
        consultas.listarFilmes(connection);
        Filme filmeSenhorDosAneis = new Filme(100, "O Senhor dos Aneis", 2007, 
                "Diretor1", "Aventura", "EUA");
        consultas.inserirFilme(connection, filmeSenhorDosAneis);
        Filme filmeHarryPotter = new Filme(101, "Harry Potter", 2005, 
                "Diretor2", "Aventura", "EUA");
        consultas.inserirFilme(connection, filmeHarryPotter);
        consultas.listarFilmes(connection);
        conBD.fecharConexao();
    }
}
