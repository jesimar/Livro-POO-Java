package code.unidade4.secao2.ap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jesimar
 */
public class Consultas {
    
    public void listarFilmes(Connection connection){
        try {
            String sql = "SELECT * FROM `filmes`";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            ResultSet resultSet = pStatement.executeQuery();
            System.out.println("Resultados da Consulta: ");
            System.out.printf("| %8s | %16s | %16s | %16s | %16s | %18s |%n",
                    "codigo", "nome", "ano", "diretor", "classificacao", "pais");
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String idade = resultSet.getString("ano");
                String profissao = resultSet.getString("diretor");
                String cidade = resultSet.getString("classificacao");
                String estado = resultSet.getString("pais");
                String codigo = resultSet.getString("codigo");
                System.out.printf("| %8s | %16s | %16s | %16s | %16s | %18s |%n", 
                        codigo, nome, idade, profissao, cidade, estado);
            }
        } catch (SQLException ex) {
            System.out.println("Problema de acesso ao banco de dados");
            System.out.println(ex);
        }
    }
    
    public void inserirFilme(Connection connection, Filme cliente){
        try {
            Statement st = connection.createStatement();
            String sql = "INSERT INTO `filmes` (" +
                    "nome, ano, diretor, classificacao, pais) " + 
                    "VALUES ('" + 
                    cliente.getNome() + "', " + 
                    cliente.getAno()+ ", '" + 
                    cliente.getDiretor()+ "', '" + 
                    cliente.getClassificacao()+ "', '" + 
                    cliente.getPais()+ "')";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException ex) {
            System.out.println("Problema de acesso ao banco de dados");
            System.out.println(ex);
        }
    }
}
